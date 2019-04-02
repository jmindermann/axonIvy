package ch.ivy.add.portalkit.service.integrators;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class SideStepProcessServiceIntegratorData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SideStepProcessServiceIntegratorData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4065124984963933193L;

  private transient java.lang.String endpoint;

  /**
   * Gets the field endpoint.
   * @return the value of the field endpoint; may be null.
   */
  public java.lang.String getEndpoint()
  {
    return endpoint;
  }

  /**
   * Sets the field endpoint.
   * @param _endpoint the new value of the field endpoint.
   */
  public void setEndpoint(java.lang.String _endpoint)
  {
    endpoint = _endpoint;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WsException> errors;

  /**
   * Gets the field errors.
   * @return the value of the field errors; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WsException> getErrors()
  {
    return errors;
  }

  /**
   * Sets the field errors.
   * @param _errors the new value of the field errors.
   */
  public void setErrors(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WsException> _errors)
  {
    errors = _errors;
  }

  private transient java.lang.String password;

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

  private transient ch.ivy.ws.addon.SideStepSearchCriteria sideStepSearchCriteria;

  /**
   * Gets the field sideStepSearchCriteria.
   * @return the value of the field sideStepSearchCriteria; may be null.
   */
  public ch.ivy.ws.addon.SideStepSearchCriteria getSideStepSearchCriteria()
  {
    return sideStepSearchCriteria;
  }

  /**
   * Sets the field sideStepSearchCriteria.
   * @param _sideStepSearchCriteria the new value of the field sideStepSearchCriteria.
   */
  public void setSideStepSearchCriteria(ch.ivy.ws.addon.SideStepSearchCriteria _sideStepSearchCriteria)
  {
    sideStepSearchCriteria = _sideStepSearchCriteria;
  }

  private transient java.util.List<ch.ivy.ws.addon.IvySideStep> sideSteps;

  /**
   * Gets the field sideSteps.
   * @return the value of the field sideSteps; may be null.
   */
  public java.util.List<ch.ivy.ws.addon.IvySideStep> getSideSteps()
  {
    return sideSteps;
  }

  /**
   * Sets the field sideSteps.
   * @param _sideSteps the new value of the field sideSteps.
   */
  public void setSideSteps(java.util.List<ch.ivy.ws.addon.IvySideStep> _sideSteps)
  {
    sideSteps = _sideSteps;
  }

  private transient ch.ivy.addon.portalkit.persistence.domain.Server server;

  /**
   * Gets the field server.
   * @return the value of the field server; may be null.
   */
  public ch.ivy.addon.portalkit.persistence.domain.Server getServer()
  {
    return server;
  }

  /**
   * Sets the field server.
   * @param _server the new value of the field server.
   */
  public void setServer(ch.ivy.addon.portalkit.persistence.domain.Server _server)
  {
    server = _server;
  }

  private transient java.lang.String userName;

  /**
   * Gets the field userName.
   * @return the value of the field userName; may be null.
   */
  public java.lang.String getUserName()
  {
    return userName;
  }

  /**
   * Sets the field userName.
   * @param _userName the new value of the field userName.
   */
  public void setUserName(java.lang.String _userName)
  {
    userName = _userName;
  }

  private transient java.lang.Boolean isUrlBuiltFromSystemProperties;

  /**
   * Gets the field isUrlBuiltFromSystemProperties.
   * @return the value of the field isUrlBuiltFromSystemProperties; may be null.
   */
  public java.lang.Boolean getIsUrlBuiltFromSystemProperties()
  {
    return isUrlBuiltFromSystemProperties;
  }

  /**
   * Sets the field isUrlBuiltFromSystemProperties.
   * @param _isUrlBuiltFromSystemProperties the new value of the field isUrlBuiltFromSystemProperties.
   */
  public void setIsUrlBuiltFromSystemProperties(java.lang.Boolean _isUrlBuiltFromSystemProperties)
  {
    isUrlBuiltFromSystemProperties = _isUrlBuiltFromSystemProperties;
  }

  private transient java.lang.String language;

  /**
   * Gets the field language.
   * @return the value of the field language; may be null.
   */
  public java.lang.String getLanguage()
  {
    return language;
  }

  /**
   * Sets the field language.
   * @param _language the new value of the field language.
   */
  public void setLanguage(java.lang.String _language)
  {
    language = _language;
  }

}
