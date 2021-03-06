// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/
package org.apache.myfaces.trinidad.component;

import javax.faces.el.MethodBinding;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.FacesEvent;
import javax.faces.event.PhaseId;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.event.PollEvent;
import org.apache.myfaces.trinidad.event.PollListener;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * The poll component initiates poll to the server.
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.PollEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values<br>Invoke Application</td>
 * <td valign="top">Event delivered when the poll component polls the server.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXPoll extends UIXComponentBase
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey IMMEDIATE_KEY =
    TYPE.registerKey("immediate", Boolean.class, Boolean.FALSE);
  static public final PropertyKey POLL_LISTENER_KEY =
    TYPE.registerKey("pollListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Poll";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Poll";

  /**
   * Construct an instance of the UIXPoll.
   */
  public UIXPoll()
  {
    super("org.apache.myfaces.trinidad.Poll");
  }
  	

  //
  // Abstract methods implemented by subclass.
  @Override
  public void broadcast(FacesEvent event) throws AbortProcessingException
  {
    // Perform standard superclass processing
    super.broadcast(event);

    // Notify the specified Poll listener method (if any)
    if (event instanceof PollEvent)
    {
      broadcastToMethodBinding(event, getPollListener());
    }
  }

  @Override
  public void queueEvent(FacesEvent e)
  {
    if ((e instanceof PollEvent) && (e.getSource() == this))
    {
      if (isImmediate())
      {
        e.setPhaseId(PhaseId.ANY_PHASE);
      }
      else
      {
        e.setPhaseId(PhaseId.INVOKE_APPLICATION);
      }
    }

    super.queueEvent(e);
  }

  /**
   * Gets whether data validation 
   *           should be skipped when poll
   *           events are generated by this component.
   * 
   *           When immediate is false (the default), events will
   *           be delivered during the Invoke Application phase, which
   *           will trigger validation.  When set to true,  events
   *           will be executed during the Apply Request Values phase.
   *
   * @return  the new immediate value
   */
  final public boolean isImmediate()
  {
    return ComponentUtils.resolveBoolean(getProperty(IMMEDIATE_KEY), false);
  }

  /**
   * Sets whether data validation 
   *           should be skipped when poll
   *           events are generated by this component.
   * 
   *           When immediate is false (the default), events will
   *           be delivered during the Invoke Application phase, which
   *           will trigger validation.  When set to true,  events
   *           will be executed during the Apply Request Values phase.
   * 
   * @param immediate  the new immediate value
   */
  final public void setImmediate(boolean immediate)
  {
    setProperty(IMMEDIATE_KEY, immediate ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets a method reference to a poll listener
   *
   * @return  the new pollListener value
   */
  final public MethodBinding getPollListener()
  {
    return (MethodBinding)getProperty(POLL_LISTENER_KEY);
  }

  /**
   * Sets a method reference to a poll listener
   * 
   * @param pollListener  the new pollListener value
   */
  final public void setPollListener(MethodBinding pollListener)
  {
    setProperty(POLL_LISTENER_KEY, (pollListener));
  }

  /**
   * Adds a poll listener.
   *
   * @param listener  the poll listener to add
   */
  final public void addPollListener(
    PollListener listener)
  {
    addFacesListener(listener);
  }

  /**
   * Removes a poll listener.
   *
   * @param listener  the poll listener to remove
   */
  final public void removePollListener(
    PollListener listener)
  {
    removeFacesListener(listener);
  }

  /**
   * Returns an array of attached poll listeners.
   *
   * @return  an array of attached poll listeners.
   */
  final public PollListener[] getPollListeners()
  {
    return (PollListener[])getFacesListeners(PollListener.class);
  }

  @Override
  public String getFamily()
  {
    return COMPONENT_FAMILY;
  }

  @Override
  protected FacesBean.Type getBeanType()
  {
    return TYPE;
  }

  /**
   * Construct an instance of the UIXPoll.
   */
  protected UIXPoll(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Poll","org.apache.myfaces.trinidad.Poll");
  }
}
