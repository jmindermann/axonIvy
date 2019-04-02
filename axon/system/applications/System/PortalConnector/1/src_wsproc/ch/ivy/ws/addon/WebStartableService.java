package ch.ivy.ws.addon;

/**
 * 
 */
@SuppressWarnings("all")
@javax.annotation.Generated(
  comments="This class implements the WS endpoints of the process 'WebStartableService'. The class can be customized by moving it to the src-folder. See Designer Guide for more information.", 
  value = { "ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessClassBuilder" })
@javax.jws.WebService
public class WebStartableService extends ch.ivyteam.ivy.webservice.process.restricted.AbstractWebServiceProcess
{

  public WebStartableService(ch.ivyteam.ivy.webservice.process.restricted.IWebServiceProcessBeanRuntime webServiceProcessBeanRuntime)
  {
    super(webServiceProcessBeanRuntime);
  }

  /**
   * @param isUrlBuiltFromSystemProperties
   * @param language
   * @param webStartableSearchCriteria
   * @return
   * @throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
   */
  @javax.jws.WebMethod
  @javax.jws.WebResult(name="result")
  public FindWebStartablesByCriteriaResult findWebStartablesByCriteria(@javax.jws.WebParam(name="isUrlBuiltFromSystemProperties") java.lang.Boolean isUrlBuiltFromSystemProperties, 
             @javax.jws.WebParam(name="language") java.lang.String language, 
             @javax.jws.WebParam(name="webStartableSearchCriteria") ch.ivy.ws.addon.service.WebStartableSearchCriteria webStartableSearchCriteria)
    throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
  {
    java.util.Map<String, Object> params = new java.util.HashMap<String, Object>();
    ch.ivyteam.ivy.scripting.objects.Tuple processResult;
    FindWebStartablesByCriteriaResult result = new FindWebStartablesByCriteriaResult();

    params.put("isUrlBuiltFromSystemProperties", isUrlBuiltFromSystemProperties);
    params.put("language", language);
    params.put("webStartableSearchCriteria", webStartableSearchCriteria);

    processResult = executeProcess("findWebStartablesByCriteria(Boolean,String,ch.ivy.ws.addon.service.WebStartableSearchCriteria)", params);

    result.setErrors((java.util.List<ch.ivy.ws.addon.WSException>)getTupleField(processResult, "errors"));
    result.setWebStartables((java.util.List<ch.ivy.ws.addon.types.IvyWebStartable>)getTupleField(processResult, "webStartables"));
    return result;
  }

  /**
   * Result type for the findWebStartablesByCriteria method
   */
  public static class FindWebStartablesByCriteriaResult
  {
    private java.util.List<ch.ivy.ws.addon.WSException> fErrors;

    private java.util.List<ch.ivy.ws.addon.types.IvyWebStartable> fWebStartables;

    public java.util.List<ch.ivy.ws.addon.WSException> getErrors()
    {
      return fErrors;
    }

    public void setErrors(java.util.List<ch.ivy.ws.addon.WSException> errors)
    {
      fErrors = errors;
    }

    public java.util.List<ch.ivy.ws.addon.types.IvyWebStartable> getWebStartables()
    {
      return fWebStartables;
    }

    public void setWebStartables(java.util.List<ch.ivy.ws.addon.types.IvyWebStartable> webStartables)
    {
      fWebStartables = webStartables;
    }

  }
}