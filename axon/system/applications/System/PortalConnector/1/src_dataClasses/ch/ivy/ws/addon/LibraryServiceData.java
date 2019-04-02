package ch.ivy.ws.addon;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class LibraryServiceData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class LibraryServiceData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 6927068248501653549L;

  private transient java.util.List<java.lang.String> apps;

  /**
   * Gets the field apps.
   * @return the value of the field apps; may be null.
   */
  public java.util.List<java.lang.String> getApps()
  {
    return apps;
  }

  /**
   * Sets the field apps.
   * @param _apps the new value of the field apps.
   */
  public void setApps(java.util.List<java.lang.String> _apps)
  {
    apps = _apps;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WSException> errors;

  /**
   * Gets the field errors.
   * @return the value of the field errors; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WSException> getErrors()
  {
    return errors;
  }

  /**
   * Sets the field errors.
   * @param _errors the new value of the field errors.
   */
  public void setErrors(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WSException> _errors)
  {
    errors = _errors;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.types.IvyLibrary> libraries;

  /**
   * Gets the field libraries.
   * @return the value of the field libraries; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.types.IvyLibrary> getLibraries()
  {
    return libraries;
  }

  /**
   * Sets the field libraries.
   * @param _libraries the new value of the field libraries.
   */
  public void setLibraries(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.types.IvyLibrary> _libraries)
  {
    libraries = _libraries;
  }

  private transient ch.ivy.ws.addon.types.IvyLibrary library;

  /**
   * Gets the field library.
   * @return the value of the field library; may be null.
   */
  public ch.ivy.ws.addon.types.IvyLibrary getLibrary()
  {
    return library;
  }

  /**
   * Sets the field library.
   * @param _library the new value of the field library.
   */
  public void setLibrary(ch.ivy.ws.addon.types.IvyLibrary _library)
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

}
