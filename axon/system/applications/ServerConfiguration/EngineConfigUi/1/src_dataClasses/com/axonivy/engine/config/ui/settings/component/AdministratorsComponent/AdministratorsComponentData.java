package com.axonivy.engine.config.ui.settings.component.AdministratorsComponent;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class AdministratorsComponentData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class AdministratorsComponentData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -1282080246734586350L;

  private ch.ivyteam.ivy.server.configuration.system.db.AdministratorManager administratorManager;

  /**
   * Gets the field administratorManager.
   * @return the value of the field administratorManager; may be null.
   */
  public ch.ivyteam.ivy.server.configuration.system.db.AdministratorManager getAdministratorManager()
  {
    return administratorManager;
  }

  /**
   * Sets the field administratorManager.
   * @param _administratorManager the new value of the field administratorManager.
   */
  public void setAdministratorManager(ch.ivyteam.ivy.server.configuration.system.db.AdministratorManager _administratorManager)
  {
    administratorManager = _administratorManager;
  }

  private ch.ivyteam.ivy.security.Administrator selectedAdministrator;

  /**
   * Gets the field selectedAdministrator.
   * @return the value of the field selectedAdministrator; may be null.
   */
  public ch.ivyteam.ivy.security.Administrator getSelectedAdministrator()
  {
    return selectedAdministrator;
  }

  /**
   * Sets the field selectedAdministrator.
   * @param _selectedAdministrator the new value of the field selectedAdministrator.
   */
  public void setSelectedAdministrator(ch.ivyteam.ivy.security.Administrator _selectedAdministrator)
  {
    selectedAdministrator = _selectedAdministrator;
  }

  private java.lang.Boolean connectionOK;

  /**
   * Gets the field connectionOK.
   * @return the value of the field connectionOK; may be null.
   */
  public java.lang.Boolean getConnectionOK()
  {
    return connectionOK;
  }

  /**
   * Sets the field connectionOK.
   * @param _connectionOK the new value of the field connectionOK.
   */
  public void setConnectionOK(java.lang.Boolean _connectionOK)
  {
    connectionOK = _connectionOK;
  }

  private com.axonivy.engine.config.ui.settings.ConfigData currentConfigData;

  /**
   * Gets the field currentConfigData.
   * @return the value of the field currentConfigData; may be null.
   */
  public com.axonivy.engine.config.ui.settings.ConfigData getCurrentConfigData()
  {
    return currentConfigData;
  }

  /**
   * Sets the field currentConfigData.
   * @param _currentConfigData the new value of the field currentConfigData.
   */
  public void setCurrentConfigData(com.axonivy.engine.config.ui.settings.ConfigData _currentConfigData)
  {
    currentConfigData = _currentConfigData;
  }

  private com.axon.ivy.engine.config.ConnectionInfo connectionInfo;

  /**
   * Gets the field connectionInfo.
   * @return the value of the field connectionInfo; may be null.
   */
  public com.axon.ivy.engine.config.ConnectionInfo getConnectionInfo()
  {
    return connectionInfo;
  }

  /**
   * Sets the field connectionInfo.
   * @param _connectionInfo the new value of the field connectionInfo.
   */
  public void setConnectionInfo(com.axon.ivy.engine.config.ConnectionInfo _connectionInfo)
  {
    connectionInfo = _connectionInfo;
  }

  private com.axonivy.engine.config.ui.settings.AdminUser newAdmin;

  /**
   * Gets the field newAdmin.
   * @return the value of the field newAdmin; may be null.
   */
  public com.axonivy.engine.config.ui.settings.AdminUser getNewAdmin()
  {
    return newAdmin;
  }

  /**
   * Sets the field newAdmin.
   * @param _newAdmin the new value of the field newAdmin.
   */
  public void setNewAdmin(com.axonivy.engine.config.ui.settings.AdminUser _newAdmin)
  {
    newAdmin = _newAdmin;
  }

  private com.axonivy.engine.config.ui.settings.AdminUser editAdmin;

  /**
   * Gets the field editAdmin.
   * @return the value of the field editAdmin; may be null.
   */
  public com.axonivy.engine.config.ui.settings.AdminUser getEditAdmin()
  {
    return editAdmin;
  }

  /**
   * Sets the field editAdmin.
   * @param _editAdmin the new value of the field editAdmin.
   */
  public void setEditAdmin(com.axonivy.engine.config.ui.settings.AdminUser _editAdmin)
  {
    editAdmin = _editAdmin;
  }

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
