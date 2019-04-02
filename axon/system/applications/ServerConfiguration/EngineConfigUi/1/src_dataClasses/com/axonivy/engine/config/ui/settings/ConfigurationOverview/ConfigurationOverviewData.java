package com.axonivy.engine.config.ui.settings.ConfigurationOverview;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ConfigurationOverviewData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ConfigurationOverviewData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3629904395047020194L;

  private com.axon.ivy.engine.config.SystemDatabaseSettings databaseSettings;

  /**
   * Gets the field databaseSettings.
   * @return the value of the field databaseSettings; may be null.
   */
  public com.axon.ivy.engine.config.SystemDatabaseSettings getDatabaseSettings()
  {
    return databaseSettings;
  }

  /**
   * Sets the field databaseSettings.
   * @param _databaseSettings the new value of the field databaseSettings.
   */
  public void setDatabaseSettings(com.axon.ivy.engine.config.SystemDatabaseSettings _databaseSettings)
  {
    databaseSettings = _databaseSettings;
  }

  private java.lang.Integer activeTabIndex;

  /**
   * Gets the field activeTabIndex.
   * @return the value of the field activeTabIndex; may be null.
   */
  public java.lang.Integer getActiveTabIndex()
  {
    return activeTabIndex;
  }

  /**
   * Sets the field activeTabIndex.
   * @param _activeTabIndex the new value of the field activeTabIndex.
   */
  public void setActiveTabIndex(java.lang.Integer _activeTabIndex)
  {
    activeTabIndex = _activeTabIndex;
  }

  private org.primefaces.event.TabChangeEvent tabChangeEvent;

  /**
   * Gets the field tabChangeEvent.
   * @return the value of the field tabChangeEvent; may be null.
   */
  public org.primefaces.event.TabChangeEvent getTabChangeEvent()
  {
    return tabChangeEvent;
  }

  /**
   * Sets the field tabChangeEvent.
   * @param _tabChangeEvent the new value of the field tabChangeEvent.
   */
  public void setTabChangeEvent(org.primefaces.event.TabChangeEvent _tabChangeEvent)
  {
    tabChangeEvent = _tabChangeEvent;
  }

}
