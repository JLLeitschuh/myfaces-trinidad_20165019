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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * This is base abstraction for column.
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class UIXColumn extends UIXComponentBase
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey SORT_PROPERTY_KEY =
    TYPE.registerKey("sortProperty", String.class);
  static public final String HEADER_FACET = "header";
  static public final String FOOTER_FACET = "footer";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Column";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Column";

  /**
   * Construct an instance of the UIXColumn.
   */
  public UIXColumn()
  {
    super("org.apache.myfaces.trinidad.Column");
  }
    /**
   * Does not process the facets of this column. Only this column and
   * its children are processed.
   */
  @Override
  public void processDecodes(FacesContext context)
  {
    if (!isRendered())
      return;

    // Process all the children of this component:
    new ChildLoop.Decode().runAlways(context, this);

    // Process this component itself
    decode(context);
  }

  /**
   * Does not process the facets of this column. Only this column and
   * its children are processed.
   */
  @Override
  public void processValidators(FacesContext context)
  {
    if (!isRendered())
      return;

    // Process all the children of this component
    new ChildLoop.Validate().runAlways(context, this);
  }

  /**
   * Does not process the facets of this column. Only this column and
   * its children are processed.
   */
  @Override
  public void processUpdates(FacesContext context)
  {
    if (!isRendered())
      return;

    // Process all the children of this component
    new ChildLoop.Update().runAlways(context, this);
  }

  /**
   * the node to use to render this column's header.
   */
  final public UIComponent getHeader()
  {
    return getFacet(HEADER_FACET);
  }

  /**
   * the node to use to render this column's header.
   */
  @SuppressWarnings("unchecked")
  final public void setHeader(UIComponent headerFacet)
  {
    getFacets().put(HEADER_FACET, headerFacet);
  }

  /**
   * the node to render as this column's footer.
   */
  final public UIComponent getFooter()
  {
    return getFacet(FOOTER_FACET);
  }

  /**
   * the node to render as this column's footer.
   */
  @SuppressWarnings("unchecked")
  final public void setFooter(UIComponent footerFacet)
  {
    getFacets().put(FOOTER_FACET, footerFacet);
  }

  /**
   * Gets The property that is displayed by this Column. This is the
   *             property that the framework might use to (for example) sort
   *             the Table's data.
   *
   * @return  the new sortProperty value
   */
  final public String getSortProperty()
  {
    return ComponentUtils.resolveString(getProperty(SORT_PROPERTY_KEY));
  }

  /**
   * Sets The property that is displayed by this Column. This is the
   *             property that the framework might use to (for example) sort
   *             the Table's data.
   * 
   * @param sortProperty  the new sortProperty value
   */
  final public void setSortProperty(String sortProperty)
  {
    setProperty(SORT_PROPERTY_KEY, (sortProperty));
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
   * Construct an instance of the UIXColumn.
   */
  protected UIXColumn(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Column","org.apache.myfaces.trinidad.Column");
  }
}
