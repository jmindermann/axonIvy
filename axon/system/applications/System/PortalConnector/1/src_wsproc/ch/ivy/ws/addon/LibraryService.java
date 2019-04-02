package ch.ivy.ws.addon;

/**
 * 
 */
@SuppressWarnings("all")
@javax.annotation.Generated(
  comments="This class implements the WS endpoints of the process 'LibraryService'. The class can be customized by moving it to the src-folder. See Designer Guide for more information.", 
  value = { "ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessClassBuilder" })
@javax.jws.WebService
public class LibraryService extends ch.ivyteam.ivy.webservice.process.restricted.AbstractWebServiceProcess
{

  public LibraryService(ch.ivyteam.ivy.webservice.process.restricted.IWebServiceProcessBeanRuntime webServiceProcessBeanRuntime)
  {
    super(webServiceProcessBeanRuntime);
  }

  /**
   * @param apps
   * @return
   * @throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
   */
  @javax.jws.WebMethod
  @javax.jws.WebResult(name="result")
  public GetLibrariesResult getLibraries(@javax.jws.WebParam(name="apps") java.util.List<java.lang.String> apps)
    throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
  {
    java.util.Map<String, Object> params = new java.util.HashMap<String, Object>();
    ch.ivyteam.ivy.scripting.objects.Tuple processResult;
    GetLibrariesResult result = new GetLibrariesResult();

    params.put("apps", apps);

    processResult = executeProcess("getLibraries(List<String>)", params);

    result.setErrors((java.util.List<ch.ivy.ws.addon.WSException>)getTupleField(processResult, "errors"));
    result.setLibraries((java.util.List<ch.ivy.ws.addon.types.IvyLibrary>)getTupleField(processResult, "libraries"));
    return result;
  }

  /**
   * Result type for the getLibraries method
   */
  public static class GetLibrariesResult
  {
    private java.util.List<ch.ivy.ws.addon.WSException> fErrors;

    private java.util.List<ch.ivy.ws.addon.types.IvyLibrary> fLibraries;

    public java.util.List<ch.ivy.ws.addon.WSException> getErrors()
    {
      return fErrors;
    }

    public void setErrors(java.util.List<ch.ivy.ws.addon.WSException> errors)
    {
      fErrors = errors;
    }

    public java.util.List<ch.ivy.ws.addon.types.IvyLibrary> getLibraries()
    {
      return fLibraries;
    }

    public void setLibraries(java.util.List<ch.ivy.ws.addon.types.IvyLibrary> libraries)
    {
      fLibraries = libraries;
    }

  }
  /**
   * @param libraryId
   * @param appName
   * @return
   * @throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
   */
  @javax.jws.WebMethod
  @javax.jws.WebResult(name="result")
  public GetLibraryResult getLibrary(@javax.jws.WebParam(name="libraryId") java.lang.String libraryId, 
             @javax.jws.WebParam(name="appName") java.lang.String appName)
    throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
  {
    java.util.Map<String, Object> params = new java.util.HashMap<String, Object>();
    ch.ivyteam.ivy.scripting.objects.Tuple processResult;
    GetLibraryResult result = new GetLibraryResult();

    params.put("libraryId", libraryId);
    params.put("appName", appName);

    processResult = executeProcess("getLibrary(String,String)", params);

    result.setErrors((java.util.List<ch.ivy.ws.addon.WSException>)getTupleField(processResult, "errors"));
    result.setLibrary((ch.ivy.ws.addon.types.IvyLibrary)getTupleField(processResult, "library"));
    return result;
  }

  /**
   * Result type for the getLibrary method
   */
  public static class GetLibraryResult
  {
    private java.util.List<ch.ivy.ws.addon.WSException> fErrors;

    private ch.ivy.ws.addon.types.IvyLibrary fLibrary;

    public java.util.List<ch.ivy.ws.addon.WSException> getErrors()
    {
      return fErrors;
    }

    public void setErrors(java.util.List<ch.ivy.ws.addon.WSException> errors)
    {
      fErrors = errors;
    }

    public ch.ivy.ws.addon.types.IvyLibrary getLibrary()
    {
      return fLibrary;
    }

    public void setLibrary(ch.ivy.ws.addon.types.IvyLibrary library)
    {
      fLibrary = library;
    }

  }
}