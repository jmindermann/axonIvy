package ch.ivy.ws.addon;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class SideStepServiceData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SideStepServiceData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4557292742659911966L;

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

  private transient ch.ivy.ws.addon.service.SideStepSearchCriteria sideStepSearchCriteria;

  /**
   * Gets the field sideStepSearchCriteria.
   * @return the value of the field sideStepSearchCriteria; may be null.
   */
  public ch.ivy.ws.addon.service.SideStepSearchCriteria getSideStepSearchCriteria()
  {
    return sideStepSearchCriteria;
  }

  /**
   * Sets the field sideStepSearchCriteria.
   * @param _sideStepSearchCriteria the new value of the field sideStepSearchCriteria.
   */
  public void setSideStepSearchCriteria(ch.ivy.ws.addon.service.SideStepSearchCriteria _sideStepSearchCriteria)
  {
    sideStepSearchCriteria = _sideStepSearchCriteria;
  }

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
