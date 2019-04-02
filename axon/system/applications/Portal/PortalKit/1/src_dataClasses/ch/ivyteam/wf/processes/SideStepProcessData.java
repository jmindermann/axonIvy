package ch.ivyteam.wf.processes;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class SideStepProcessData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SideStepProcessData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -6328324027081643790L;

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

  private transient java.util.List<ch.ivy.ws.addon.IvySideStep> ivySideSteps;

  /**
   * Gets the field ivySideSteps.
   * @return the value of the field ivySideSteps; may be null.
   */
  public java.util.List<ch.ivy.ws.addon.IvySideStep> getIvySideSteps()
  {
    return ivySideSteps;
  }

  /**
   * Sets the field ivySideSteps.
   * @param _ivySideSteps the new value of the field ivySideSteps.
   */
  public void setIvySideSteps(java.util.List<ch.ivy.ws.addon.IvySideStep> _ivySideSteps)
  {
    ivySideSteps = _ivySideSteps;
  }

  private transient java.util.List<ch.ivy.addon.portalkit.bo.RemoteSideStep> sideSteps;

  /**
   * Gets the field sideSteps.
   * @return the value of the field sideSteps; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.bo.RemoteSideStep> getSideSteps()
  {
    return sideSteps;
  }

  /**
   * Sets the field sideSteps.
   * @param _sideSteps the new value of the field sideSteps.
   */
  public void setSideSteps(java.util.List<ch.ivy.addon.portalkit.bo.RemoteSideStep> _sideSteps)
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

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WsException> tempErrors;

  /**
   * Gets the field tempErrors.
   * @return the value of the field tempErrors; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WsException> getTempErrors()
  {
    return tempErrors;
  }

  /**
   * Sets the field tempErrors.
   * @param _tempErrors the new value of the field tempErrors.
   */
  public void setTempErrors(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WsException> _tempErrors)
  {
    tempErrors = _tempErrors;
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

  private transient java.lang.Boolean isMultiServer;

  /**
   * Gets the field isMultiServer.
   * @return the value of the field isMultiServer; may be null.
   */
  public java.lang.Boolean getIsMultiServer()
  {
    return isMultiServer;
  }

  /**
   * Sets the field isMultiServer.
   * @param _isMultiServer the new value of the field isMultiServer.
   */
  public void setIsMultiServer(java.lang.Boolean _isMultiServer)
  {
    isMultiServer = _isMultiServer;
  }

}
