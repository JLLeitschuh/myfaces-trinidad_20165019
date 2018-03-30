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
package org.apache.myfaces.trinidadinternal.taglib.core.output;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.core.output.CoreImage;
import org.apache.myfaces.trinidadinternal.taglib.UIXObjectTag;

/**
 * Auto-generated tag class.
 */
public class CoreImageTag extends UIXObjectTag
{

  /**
   * Construct an instance of the CoreImageTag.
   */
  public CoreImageTag()
  {
  }

  public String getComponentType()
  {
    return "org.apache.myfaces.trinidad.CoreImage";
  }

  public String getRendererType()
  {
    return "org.apache.myfaces.trinidad.Image";
  }

  private String _inlineStyle;
  final public void setInlineStyle(String inlineStyle)
  {
    _inlineStyle = inlineStyle;
  }

  private String _styleClass;
  final public void setStyleClass(String styleClass)
  {
    _styleClass = styleClass;
  }

  private String _shortDesc;
  final public void setShortDesc(String shortDesc)
  {
    _shortDesc = shortDesc;
  }

  private String _partialTriggers;
  final public void setPartialTriggers(String partialTriggers)
  {
    _partialTriggers = partialTriggers;
  }

  private String _onclick;
  final public void setOnclick(String onclick)
  {
    _onclick = onclick;
  }

  private String _ondblclick;
  final public void setOndblclick(String ondblclick)
  {
    _ondblclick = ondblclick;
  }

  private String _onmousedown;
  final public void setOnmousedown(String onmousedown)
  {
    _onmousedown = onmousedown;
  }

  private String _onmouseup;
  final public void setOnmouseup(String onmouseup)
  {
    _onmouseup = onmouseup;
  }

  private String _onmouseover;
  final public void setOnmouseover(String onmouseover)
  {
    _onmouseover = onmouseover;
  }

  private String _onmousemove;
  final public void setOnmousemove(String onmousemove)
  {
    _onmousemove = onmousemove;
  }

  private String _onmouseout;
  final public void setOnmouseout(String onmouseout)
  {
    _onmouseout = onmouseout;
  }

  private String _onkeypress;
  final public void setOnkeypress(String onkeypress)
  {
    _onkeypress = onkeypress;
  }

  private String _onkeydown;
  final public void setOnkeydown(String onkeydown)
  {
    _onkeydown = onkeydown;
  }

  private String _onkeyup;
  final public void setOnkeyup(String onkeyup)
  {
    _onkeyup = onkeyup;
  }

  private String _source;
  final public void setSource(String source)
  {
    _source = source;
  }

  private String _longDescURL;
  final public void setLongDescURL(String longDescURL)
  {
    _longDescURL = longDescURL;
  }

  private String _imageMapType;
  final public void setImageMapType(String imageMapType)
  {
    _imageMapType = imageMapType;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    setProperty(bean, CoreImage.INLINE_STYLE_KEY, _inlineStyle);
    setProperty(bean, CoreImage.IMAGE_MAP_TYPE_KEY, _imageMapType);
    setStringArrayProperty(bean, CoreImage.PARTIAL_TRIGGERS_KEY, _partialTriggers);
    setProperty(bean, CoreImage.ONCLICK_KEY, _onclick);
    setProperty(bean, CoreImage.ONKEYDOWN_KEY, _onkeydown);
    setProperty(bean, CoreImage.LONG_DESC_URL_KEY, _longDescURL);
    setProperty(bean, CoreImage.ONMOUSEUP_KEY, _onmouseup);
    setProperty(bean, CoreImage.SOURCE_KEY, _source);
    setProperty(bean, CoreImage.STYLE_CLASS_KEY, _styleClass);
    setProperty(bean, CoreImage.ONMOUSEDOWN_KEY, _onmousedown);
    setProperty(bean, CoreImage.ONMOUSEOUT_KEY, _onmouseout);
    setProperty(bean, CoreImage.ONMOUSEOVER_KEY, _onmouseover);
    setProperty(bean, CoreImage.ONMOUSEMOVE_KEY, _onmousemove);
    setProperty(bean, CoreImage.ONKEYUP_KEY, _onkeyup);
    setProperty(bean, CoreImage.ONKEYPRESS_KEY, _onkeypress);
    setProperty(bean, CoreImage.SHORT_DESC_KEY, _shortDesc);
    setProperty(bean, CoreImage.ONDBLCLICK_KEY, _ondblclick);
  }

  @Override
  public void release()
  {
    super.release();
    _inlineStyle = null;
    _imageMapType = null;
    _partialTriggers = null;
    _onclick = null;
    _onkeydown = null;
    _longDescURL = null;
    _onmouseup = null;
    _source = null;
    _styleClass = null;
    _onmousedown = null;
    _onmouseout = null;
    _onmouseover = null;
    _onmousemove = null;
    _onkeyup = null;
    _onkeypress = null;
    _shortDesc = null;
    _ondblclick = null;
  }
}
