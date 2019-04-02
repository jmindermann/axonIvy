package ch.ivy.ws.addon.bo;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class SideStepServiceResult", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SideStepServiceResult extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3461376895303972271L;

  private transient java.util.List<ch.ivy.ws.addon.types.IvySideStep> sideSteps;

  /**
   * Gets the field sideSteps.
   * @return the value of the field sideSteps; may be null.
   */
  public java.util.List<ch.ivy.ws.addon.types.IvySideStep> getSideSteps()
  {
    return sideSteps;
  }

  /**
   * Sets the field sideSteps.
   * @param _sideSteps the new value of the field sideSteps.
   */
  public void setSideSteps(java.util.List<ch.ivy.ws.addon.types.IvySideStep> _sideSteps)
  {
    sideSteps = _sideSteps;
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
