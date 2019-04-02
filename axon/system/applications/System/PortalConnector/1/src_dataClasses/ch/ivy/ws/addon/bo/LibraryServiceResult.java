package ch.ivy.ws.addon.bo;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class LibraryServiceResult", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class LibraryServiceResult extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4663353165460622207L;

  private transient java.util.List<ch.ivy.ws.addon.types.IvyLibrary> libraries;

  /**
   * Gets the field libraries.
   * @return the value of the field libraries; may be null.
   */
  public java.util.List<ch.ivy.ws.addon.types.IvyLibrary> getLibraries()
  {
    return libraries;
  }

  /**
   * Sets the field libraries.
   * @param _libraries the new value of the field libraries.
   */
  public void setLibraries(java.util.List<ch.ivy.ws.addon.types.IvyLibrary> _libraries)
  {
    libraries = _libraries;
  }

  private transient java.util.List<ch.ivy.ws.addon.WSException> errors;

  /**
   * Gets the field errors.
   * @return the value of the field errors; may be null.
   */
  public java.util.List<ch.ivy.ws.addon.WSException> getErrors()
  {
    return errors;
  }

  /**
   * Sets the field errors.
   * @param _errors the new value of the field errors.
   */
  public void setErrors(java.util.List<ch.ivy.ws.addon.WSException> _errors)
  {
    errors = _errors;
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

}
