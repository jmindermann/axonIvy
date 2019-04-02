package ch.ivy.ws.addon;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class WebStartableServiceData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class WebStartableServiceData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 7410637259302340712L;

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

  private transient ch.ivy.ws.addon.service.WebStartableSearchCriteria webStartableSearchCriteria;

  /**
   * Gets the field webStartableSearchCriteria.
   * @return the value of the field webStartableSearchCriteria; may be null.
   */
  public ch.ivy.ws.addon.service.WebStartableSearchCriteria getWebStartableSearchCriteria()
  {
    return webStartableSearchCriteria;
  }

  /**
   * Sets the field webStartableSearchCriteria.
   * @param _webStartableSearchCriteria the new value of the field webStartableSearchCriteria.
   */
  public void setWebStartableSearchCriteria(ch.ivy.ws.addon.service.WebStartableSearchCriteria _webStartableSearchCriteria)
  {
    webStartableSearchCriteria = _webStartableSearchCriteria;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.types.IvyWebStartable> webStartables;

  /**
   * Gets the field webStartables.
   * @return the value of the field webStartables; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.types.IvyWebStartable> getWebStartables()
  {
    return webStartables;
  }

  /**
   * Sets the field webStartables.
   * @param _webStartables the new value of the field webStartables.
   */
  public void setWebStartables(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.types.IvyWebStartable> _webStartables)
  {
    webStartables = _webStartables;
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

}
