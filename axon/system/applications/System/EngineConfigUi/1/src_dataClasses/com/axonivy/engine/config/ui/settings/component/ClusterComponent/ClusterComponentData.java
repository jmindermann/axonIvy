package com.axonivy.engine.config.ui.settings.component.ClusterComponent;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ClusterComponentData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ClusterComponentData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -1193694447881031887L;

  private ch.ivyteam.ivy.server.configuration.system.db.AdministratorManager adminManager;

  /**
   * Gets the field adminManager.
   * @return the value of the field adminManager; may be null.
   */
  public ch.ivyteam.ivy.server.configuration.system.db.AdministratorManager getAdminManager()
  {
    return adminManager;
  }

  /**
   * Sets the field adminManager.
   * @param _adminManager the new value of the field adminManager.
   */
  public void setAdminManager(ch.ivyteam.ivy.server.configuration.system.db.AdministratorManager _adminManager)
  {
    adminManager = _adminManager;
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

  private java.lang.String localHostName;

  /**
   * Gets the field localHostName.
   * @return the value of the field localHostName; may be null.
   */
  public java.lang.String getLocalHostName()
  {
    return localHostName;
  }

  /**
   * Sets the field localHostName.
   * @param _localHostName the new value of the field localHostName.
   */
  public void setLocalHostName(java.lang.String _localHostName)
  {
    localHostName = _localHostName;
  }

  private java.lang.Integer localIdentifier;

  /**
   * Gets the field localIdentifier.
   * @return the value of the field localIdentifier; may be null.
   */
  public java.lang.Integer getLocalIdentifier()
  {
    return localIdentifier;
  }

  /**
   * Sets the field localIdentifier.
   * @param _localIdentifier the new value of the field localIdentifier.
   */
  public void setLocalIdentifier(java.lang.Integer _localIdentifier)
  {
    localIdentifier = _localIdentifier;
  }

  private ch.ivyteam.ivy.server.configuration.system.db.ClusterNode newClusterNode;

  /**
   * Gets the field newClusterNode.
   * @return the value of the field newClusterNode; may be null.
   */
  public ch.ivyteam.ivy.server.configuration.system.db.ClusterNode getNewClusterNode()
  {
    return newClusterNode;
  }

  /**
   * Sets the field newClusterNode.
   * @param _newClusterNode the new value of the field newClusterNode.
   */
  public void setNewClusterNode(ch.ivyteam.ivy.server.configuration.system.db.ClusterNode _newClusterNode)
  {
    newClusterNode = _newClusterNode;
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

  private java.lang.Boolean exists;

  /**
   * Gets the field exists.
   * @return the value of the field exists; may be null.
   */
  public java.lang.Boolean getExists()
  {
    return exists;
  }

  /**
   * Sets the field exists.
   * @param _exists the new value of the field exists.
   */
  public void setExists(java.lang.Boolean _exists)
  {
    exists = _exists;
  }

}
