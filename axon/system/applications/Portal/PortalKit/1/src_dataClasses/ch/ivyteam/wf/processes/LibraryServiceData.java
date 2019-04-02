package ch.ivyteam.wf.processes;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class LibraryServiceData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class LibraryServiceData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 5589471211430581441L;

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

  private transient java.util.List<ch.ivy.ws.addon.IvyLibrary> ivyLibraries;

  /**
   * Gets the field ivyLibraries.
   * @return the value of the field ivyLibraries; may be null.
   */
  public java.util.List<ch.ivy.ws.addon.IvyLibrary> getIvyLibraries()
  {
    return ivyLibraries;
  }

  /**
   * Sets the field ivyLibraries.
   * @param _ivyLibraries the new value of the field ivyLibraries.
   */
  public void setIvyLibraries(java.util.List<ch.ivy.ws.addon.IvyLibrary> _ivyLibraries)
  {
    ivyLibraries = _ivyLibraries;
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

  private transient java.util.ListIterator listIterator;

  /**
   * Gets the field listIterator.
   * @return the value of the field listIterator; may be null.
   */
  public java.util.ListIterator getListIterator()
  {
    return listIterator;
  }

  /**
   * Sets the field listIterator.
   * @param _listIterator the new value of the field listIterator.
   */
  public void setListIterator(java.util.ListIterator _listIterator)
  {
    listIterator = _listIterator;
  }

  private transient java.util.List<ch.ivy.addon.portalkit.bo.RemoteLibrary> libraries;

  /**
   * Gets the field libraries.
   * @return the value of the field libraries; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.bo.RemoteLibrary> getLibraries()
  {
    return libraries;
  }

  /**
   * Sets the field libraries.
   * @param _libraries the new value of the field libraries.
   */
  public void setLibraries(java.util.List<ch.ivy.addon.portalkit.bo.RemoteLibrary> _libraries)
  {
    libraries = _libraries;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> apps;

  /**
   * Gets the field apps.
   * @return the value of the field apps; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getApps()
  {
    return apps;
  }

  /**
   * Sets the field apps.
   * @param _apps the new value of the field apps.
   */
  public void setApps(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _apps)
  {
    apps = _apps;
  }

  private transient java.lang.String username;

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

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyApplication> applications;

  /**
   * Gets the field applications.
   * @return the value of the field applications; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyApplication> getApplications()
  {
    return applications;
  }

  /**
   * Sets the field applications.
   * @param _applications the new value of the field applications.
   */
  public void setApplications(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyApplication> _applications)
  {
    applications = _applications;
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

  private transient ch.ivy.addon.portalkit.bo.RemoteLibrary library;

  /**
   * Gets the field library.
   * @return the value of the field library; may be null.
   */
  public ch.ivy.addon.portalkit.bo.RemoteLibrary getLibrary()
  {
    return library;
  }

  /**
   * Sets the field library.
   * @param _library the new value of the field library.
   */
  public void setLibrary(ch.ivy.addon.portalkit.bo.RemoteLibrary _library)
  {
    library = _library;
  }

  private transient java.lang.String appName;

  /**
   * Gets the field appName.
   * @return the value of the field appName; may be null.
   */
  public java.lang.String getAppName()
  {
    return appName;
  }

  /**
   * Sets the field appName.
   * @param _appName the new value of the field appName.
   */
  public void setAppName(java.lang.String _appName)
  {
    appName = _appName;
  }

  private transient java.lang.String libraryId;

  /**
   * Gets the field libraryId.
   * @return the value of the field libraryId; may be null.
   */
  public java.lang.String getLibraryId()
  {
    return libraryId;
  }

  /**
   * Sets the field libraryId.
   * @param _libraryId the new value of the field libraryId.
   */
  public void setLibraryId(java.lang.String _libraryId)
  {
    libraryId = _libraryId;
  }

  private transient ch.ivy.ws.addon.IvyLibrary ivyLibrary;

  /**
   * Gets the field ivyLibrary.
   * @return the value of the field ivyLibrary; may be null.
   */
  public ch.ivy.ws.addon.IvyLibrary getIvyLibrary()
  {
    return ivyLibrary;
  }

  /**
   * Sets the field ivyLibrary.
   * @param _ivyLibrary the new value of the field ivyLibrary.
   */
  public void setIvyLibrary(ch.ivy.ws.addon.IvyLibrary _ivyLibrary)
  {
    ivyLibrary = _ivyLibrary;
  }

}
