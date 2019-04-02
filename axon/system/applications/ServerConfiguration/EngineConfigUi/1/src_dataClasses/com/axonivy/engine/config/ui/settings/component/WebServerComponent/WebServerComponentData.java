package com.axonivy.engine.config.ui.settings.component.WebServerComponent;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class WebServerComponentData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class WebServerComponentData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 5808227172504705978L;

  private com.axon.ivy.engine.config.SystemDatabaseSettings settings;

  /**
   * Gets the field settings.
   * @return the value of the field settings; may be null.
   */
  public com.axon.ivy.engine.config.SystemDatabaseSettings getSettings()
  {
    return settings;
  }

  /**
   * Sets the field settings.
   * @param _settings the new value of the field settings.
   */
  public void setSettings(com.axon.ivy.engine.config.SystemDatabaseSettings _settings)
  {
    settings = _settings;
  }

  private java.util.List<com.axonivy.engine.config.ui.settings.SystemProperty> properties;

  /**
   * Gets the field properties.
   * @return the value of the field properties; may be null.
   */
  public java.util.List<com.axonivy.engine.config.ui.settings.SystemProperty> getProperties()
  {
    return properties;
  }

  /**
   * Sets the field properties.
   * @param _properties the new value of the field properties.
   */
  public void setProperties(java.util.List<com.axonivy.engine.config.ui.settings.SystemProperty> _properties)
  {
    properties = _properties;
  }

}
