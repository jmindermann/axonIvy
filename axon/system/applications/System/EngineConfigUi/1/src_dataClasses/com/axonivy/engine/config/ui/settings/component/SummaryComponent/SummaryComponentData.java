package com.axonivy.engine.config.ui.settings.component.SummaryComponent;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class SummaryComponentData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SummaryComponentData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2636586390435052579L;

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

}
