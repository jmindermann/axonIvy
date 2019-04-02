package ch.ivy.ws.addon.bo;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class WebStartableServiceResult", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class WebStartableServiceResult extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -6483622882346007574L;

  private transient java.util.List<ch.ivy.ws.addon.types.IvyWebStartable> webStartables;

  /**
   * Gets the field webStartables.
   * @return the value of the field webStartables; may be null.
   */
  public java.util.List<ch.ivy.ws.addon.types.IvyWebStartable> getWebStartables()
  {
    return webStartables;
  }

  /**
   * Sets the field webStartables.
   * @param _webStartables the new value of the field webStartables.
   */
  public void setWebStartables(java.util.List<ch.ivy.ws.addon.types.IvyWebStartable> _webStartables)
  {
    webStartables = _webStartables;
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

}
