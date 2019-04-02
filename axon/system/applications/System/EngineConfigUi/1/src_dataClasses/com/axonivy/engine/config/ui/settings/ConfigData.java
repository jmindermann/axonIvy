package com.axonivy.engine.config.ui.settings;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ConfigData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ConfigData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -251713494805975970L;

  private ch.ivyteam.db.jdbc.DatabaseProduct product;

  /**
   * Gets the field product.
   * @return the value of the field product; may be null.
   */
  public ch.ivyteam.db.jdbc.DatabaseProduct getProduct()
  {
    return product;
  }

  /**
   * Sets the field product.
   * @param _product the new value of the field product.
   */
  public void setProduct(ch.ivyteam.db.jdbc.DatabaseProduct _product)
  {
    product = _product;
  }

  private ch.ivyteam.db.jdbc.JdbcDriver driver;

  /**
   * Gets the field driver.
   * @return the value of the field driver; may be null.
   */
  public ch.ivyteam.db.jdbc.JdbcDriver getDriver()
  {
    return driver;
  }

  /**
   * Sets the field driver.
   * @param _driver the new value of the field driver.
   */
  public void setDriver(ch.ivyteam.db.jdbc.JdbcDriver _driver)
  {
    driver = _driver;
  }

  private java.lang.String host;

  /**
   * Gets the field host.
   * @return the value of the field host; may be null.
   */
  public java.lang.String getHost()
  {
    return host;
  }

  /**
   * Sets the field host.
   * @param _host the new value of the field host.
   */
  public void setHost(java.lang.String _host)
  {
    host = _host;
  }

  private java.lang.String port;

  /**
   * Gets the field port.
   * @return the value of the field port; may be null.
   */
  public java.lang.String getPort()
  {
    return port;
  }

  /**
   * Sets the field port.
   * @param _port the new value of the field port.
   */
  public void setPort(java.lang.String _port)
  {
    port = _port;
  }

  private java.lang.String databaseName;

  /**
   * Gets the field databaseName.
   * @return the value of the field databaseName; may be null.
   */
  public java.lang.String getDatabaseName()
  {
    return databaseName;
  }

  /**
   * Sets the field databaseName.
   * @param _databaseName the new value of the field databaseName.
   */
  public void setDatabaseName(java.lang.String _databaseName)
  {
    databaseName = _databaseName;
  }

  private java.lang.String username;

  /**
   * Gets the field username.
   * @return the value of the field username; may be null.
   */
  public java.lang.String getUsername()
  {
    return username;
  }

  /**
   * Sets the field username.
   * @param _username the new value of the field username.
   */
  public void setUsername(java.lang.String _username)
  {
    username = _username;
  }

  private java.lang.String password;

  /**
   * Gets the field password.
   * @return the value of the field password; may be null.
   */
  public java.lang.String getPassword()
  {
    return password;
  }

  /**
   * Sets the field password.
   * @param _password the new value of the field password.
   */
  public void setPassword(java.lang.String _password)
  {
    password = _password;
  }

  private java.util.Properties creationParameters;

  /**
   * Gets the field creationParameters.
   * @return the value of the field creationParameters; may be null.
   */
  public java.util.Properties getCreationParameters()
  {
    return creationParameters;
  }

  /**
   * Sets the field creationParameters.
   * @param _creationParameters the new value of the field creationParameters.
   */
  public void setCreationParameters(java.util.Properties _creationParameters)
  {
    creationParameters = _creationParameters;
  }

  private java.util.Properties additionalProperties;

  /**
   * Gets the field additionalProperties.
   * @return the value of the field additionalProperties; may be null.
   */
  public java.util.Properties getAdditionalProperties()
  {
    return additionalProperties;
  }

  /**
   * Sets the field additionalProperties.
   * @param _additionalProperties the new value of the field additionalProperties.
   */
  public void setAdditionalProperties(java.util.Properties _additionalProperties)
  {
    additionalProperties = _additionalProperties;
  }

}
