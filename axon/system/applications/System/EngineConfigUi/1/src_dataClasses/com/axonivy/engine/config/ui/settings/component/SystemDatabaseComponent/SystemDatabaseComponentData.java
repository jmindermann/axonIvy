package com.axonivy.engine.config.ui.settings.component.SystemDatabaseComponent;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class SystemDatabaseComponentData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SystemDatabaseComponentData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8852334622429489936L;

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.db.jdbc.DatabaseProduct> databaseProducts;

  /**
   * Gets the field databaseProducts.
   * @return the value of the field databaseProducts; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.db.jdbc.DatabaseProduct> getDatabaseProducts()
  {
    return databaseProducts;
  }

  /**
   * Sets the field databaseProducts.
   * @param _databaseProducts the new value of the field databaseProducts.
   */
  public void setDatabaseProducts(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.db.jdbc.DatabaseProduct> _databaseProducts)
  {
    databaseProducts = _databaseProducts;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.db.jdbc.JdbcDriver> databaseDrivers;

  /**
   * Gets the field databaseDrivers.
   * @return the value of the field databaseDrivers; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.db.jdbc.JdbcDriver> getDatabaseDrivers()
  {
    return databaseDrivers;
  }

  /**
   * Sets the field databaseDrivers.
   * @param _databaseDrivers the new value of the field databaseDrivers.
   */
  public void setDatabaseDrivers(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.db.jdbc.JdbcDriver> _databaseDrivers)
  {
    databaseDrivers = _databaseDrivers;
  }

  private java.lang.Boolean defaultPort;

  /**
   * Gets the field defaultPort.
   * @return the value of the field defaultPort; may be null.
   */
  public java.lang.Boolean getDefaultPort()
  {
    return defaultPort;
  }

  /**
   * Sets the field defaultPort.
   * @param _defaultPort the new value of the field defaultPort.
   */
  public void setDefaultPort(java.lang.Boolean _defaultPort)
  {
    defaultPort = _defaultPort;
  }

  private com.axonivy.engine.config.ui.settings.ConfigData configData;

  /**
   * Gets the field configData.
   * @return the value of the field configData; may be null.
   */
  public com.axonivy.engine.config.ui.settings.ConfigData getConfigData()
  {
    return configData;
  }

  /**
   * Sets the field configData.
   * @param _configData the new value of the field configData.
   */
  public void setConfigData(com.axonivy.engine.config.ui.settings.ConfigData _configData)
  {
    configData = _configData;
  }

  private ch.ivyteam.ivy.server.configuration.system.db.AbstractProgressAction progressAction;

  /**
   * Gets the field progressAction.
   * @return the value of the field progressAction; may be null.
   */
  public ch.ivyteam.ivy.server.configuration.system.db.AbstractProgressAction getProgressAction()
  {
    return progressAction;
  }

  /**
   * Sets the field progressAction.
   * @param _progressAction the new value of the field progressAction.
   */
  public void setProgressAction(ch.ivyteam.ivy.server.configuration.system.db.AbstractProgressAction _progressAction)
  {
    progressAction = _progressAction;
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

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.persistence.db.DatabaseCreationParameter> requiredParameters;

  /**
   * Gets the field requiredParameters.
   * @return the value of the field requiredParameters; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.persistence.db.DatabaseCreationParameter> getRequiredParameters()
  {
    return requiredParameters;
  }

  /**
   * Sets the field requiredParameters.
   * @param _requiredParameters the new value of the field requiredParameters.
   */
  public void setRequiredParameters(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.persistence.db.DatabaseCreationParameter> _requiredParameters)
  {
    requiredParameters = _requiredParameters;
  }

  private java.lang.String newPropertyKey;

  /**
   * Gets the field newPropertyKey.
   * @return the value of the field newPropertyKey; may be null.
   */
  public java.lang.String getNewPropertyKey()
  {
    return newPropertyKey;
  }

  /**
   * Sets the field newPropertyKey.
   * @param _newPropertyKey the new value of the field newPropertyKey.
   */
  public void setNewPropertyKey(java.lang.String _newPropertyKey)
  {
    newPropertyKey = _newPropertyKey;
  }

  private java.lang.String newPropertyValue;

  /**
   * Gets the field newPropertyValue.
   * @return the value of the field newPropertyValue; may be null.
   */
  public java.lang.String getNewPropertyValue()
  {
    return newPropertyValue;
  }

  /**
   * Sets the field newPropertyValue.
   * @param _newPropertyValue the new value of the field newPropertyValue.
   */
  public void setNewPropertyValue(java.lang.String _newPropertyValue)
  {
    newPropertyValue = _newPropertyValue;
  }

}
