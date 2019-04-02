package com.axonivy.engine.config.ui.settings;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class SystemProperty", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SystemProperty extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2072123265729523458L;

  private java.lang.String name;

  /**
   * Gets the field name.
   * @return the value of the field name; may be null.
   */
  public java.lang.String getName()
  {
    return name;
  }

  /**
   * Sets the field name.
   * @param _name the new value of the field name.
   */
  public void setName(java.lang.String _name)
  {
    name = _name;
  }

  private java.lang.String value;

  /**
   * Gets the field value.
   * @return the value of the field value; may be null.
   */
  public java.lang.String getValue()
  {
    return value;
  }

  /**
   * Sets the field value.
   * @param _value the new value of the field value.
   */
  public void setValue(java.lang.String _value)
  {
    value = _value;
  }

  private java.lang.String defaultValue;

  /**
   * Gets the field defaultValue.
   * @return the value of the field defaultValue; may be null.
   */
  public java.lang.String getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * Sets the field defaultValue.
   * @param _defaultValue the new value of the field defaultValue.
   */
  public void setDefaultValue(java.lang.String _defaultValue)
  {
    defaultValue = _defaultValue;
  }

  private java.lang.String description;

  /**
   * Gets the field description.
   * @return the value of the field description; may be null.
   */
  public java.lang.String getDescription()
  {
    return description;
  }

  /**
   * Sets the field description.
   * @param _description the new value of the field description.
   */
  public void setDescription(java.lang.String _description)
  {
    description = _description;
  }

  private ch.ivyteam.ivy.system.UserInterfaceFormat userInterfaceFormat;

  /**
   * Gets the field userInterfaceFormat.
   * @return the value of the field userInterfaceFormat; may be null.
   */
  public ch.ivyteam.ivy.system.UserInterfaceFormat getUserInterfaceFormat()
  {
    return userInterfaceFormat;
  }

  /**
   * Sets the field userInterfaceFormat.
   * @param _userInterfaceFormat the new value of the field userInterfaceFormat.
   */
  public void setUserInterfaceFormat(ch.ivyteam.ivy.system.UserInterfaceFormat _userInterfaceFormat)
  {
    userInterfaceFormat = _userInterfaceFormat;
  }

  private java.util.List<java.lang.String> enumerationValues;

  /**
   * Gets the field enumerationValues.
   * @return the value of the field enumerationValues; may be null.
   */
  public java.util.List<java.lang.String> getEnumerationValues()
  {
    return enumerationValues;
  }

  /**
   * Sets the field enumerationValues.
   * @param _enumerationValues the new value of the field enumerationValues.
   */
  public void setEnumerationValues(java.util.List<java.lang.String> _enumerationValues)
  {
    enumerationValues = _enumerationValues;
  }

}
