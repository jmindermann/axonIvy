package ch.ivy.ws.addon;

/**
 * 
 */
@SuppressWarnings("all")
@javax.annotation.Generated(
  comments="This class implements the WS endpoints of the process 'SideStepProcessService'. The class can be customized by moving it to the src-folder. See Designer Guide for more information.", 
  value = { "ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessClassBuilder" })
@javax.jws.WebService
public class SideStepProcessService extends ch.ivyteam.ivy.webservice.process.restricted.AbstractWebServiceProcess
{

  public SideStepProcessService(ch.ivyteam.ivy.webservice.process.restricted.IWebServiceProcessBeanRuntime webServiceProcessBeanRuntime)
  {
    super(webServiceProcessBeanRuntime);
  }

  /**
   * @param isUrlBuiltFromSystemProperties
   * @param sideStepSearchCriteria
   * @param language
   * @return
   * @throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
   */
  @javax.jws.WebMethod
  @javax.jws.WebResult(name="result")
  public FindSideStepsByCriteriaResult findSideStepsByCriteria(@javax.jws.WebParam(name="isUrlBuiltFromSystemProperties") java.lang.Boolean isUrlBuiltFromSystemProperties, 
             @javax.jws.WebParam(name="sideStepSearchCriteria") ch.ivy.ws.addon.service.SideStepSearchCriteria sideStepSearchCriteria, 
             @javax.jws.WebParam(name="language") java.lang.String language)
    throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
  {
    java.util.Map<String, Object> params = new java.util.HashMap<String, Object>();
    ch.ivyteam.ivy.scripting.objects.Tuple processResult;
    FindSideStepsByCriteriaResult result = new FindSideStepsByCriteriaResult();

    params.put("isUrlBuiltFromSystemProperties", isUrlBuiltFromSystemProperties);
    params.put("sideStepSearchCriteria", sideStepSearchCriteria);
    params.put("language", language);

    processResult = executeProcess("findSideStepsByCriteria(Boolean,ch.ivy.ws.addon.service.SideStepSearchCriteria,String)", params);

    result.setErrors((java.util.List<ch.ivy.ws.addon.WSException>)getTupleField(processResult, "errors"));
    result.setSideSteps((java.util.List<ch.ivy.ws.addon.types.IvySideStep>)getTupleField(processResult, "sideSteps"));
    return result;
  }

  /**
   * Result type for the findSideStepsByCriteria method
   */
  public static class FindSideStepsByCriteriaResult
  {
    private java.util.List<ch.ivy.ws.addon.WSException> fErrors;

    private java.util.List<ch.ivy.ws.addon.types.IvySideStep> fSideSteps;

    public java.util.List<ch.ivy.ws.addon.WSException> getErrors()
    {
      return fErrors;
    }

    public void setErrors(java.util.List<ch.ivy.ws.addon.WSException> errors)
    {
      fErrors = errors;
    }

    public java.util.List<ch.ivy.ws.addon.types.IvySideStep> getSideSteps()
    {
      return fSideSteps;
    }

    public void setSideSteps(java.util.List<ch.ivy.ws.addon.types.IvySideStep> sideSteps)
    {
      fSideSteps = sideSteps;
    }

  }
}