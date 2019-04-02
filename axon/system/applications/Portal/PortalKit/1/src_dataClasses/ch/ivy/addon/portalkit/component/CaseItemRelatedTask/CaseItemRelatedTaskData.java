package ch.ivy.addon.portalkit.component.CaseItemRelatedTask;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class CaseItemRelatedTaskData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CaseItemRelatedTaskData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -591551940643703762L;

  private ch.ivy.addon.portalkit.bo.RemoteCase remoteCase;

  /**
   * Gets the field remoteCase.
   * @return the value of the field remoteCase; may be null.
   */
  public ch.ivy.addon.portalkit.bo.RemoteCase getRemoteCase()
  {
    return remoteCase;
  }

  /**
   * Sets the field remoteCase.
   * @param _remoteCase the new value of the field remoteCase.
   */
  public void setRemoteCase(ch.ivy.addon.portalkit.bo.RemoteCase _remoteCase)
  {
    remoteCase = _remoteCase;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.RemoteTask> relatedTasks;

  /**
   * Gets the field relatedTasks.
   * @return the value of the field relatedTasks; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.RemoteTask> getRelatedTasks()
  {
    return relatedTasks;
  }

  /**
   * Sets the field relatedTasks.
   * @param _relatedTasks the new value of the field relatedTasks.
   */
  public void setRelatedTasks(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.RemoteTask> _relatedTasks)
  {
    relatedTasks = _relatedTasks;
  }

  private ch.ivy.ws.addon.TaskSearchCriteria taskSearchCriteria;

  /**
   * Gets the field taskSearchCriteria.
   * @return the value of the field taskSearchCriteria; may be null.
   */
  public ch.ivy.ws.addon.TaskSearchCriteria getTaskSearchCriteria()
  {
    return taskSearchCriteria;
  }

  /**
   * Sets the field taskSearchCriteria.
   * @param _taskSearchCriteria the new value of the field taskSearchCriteria.
   */
  public void setTaskSearchCriteria(ch.ivy.ws.addon.TaskSearchCriteria _taskSearchCriteria)
  {
    taskSearchCriteria = _taskSearchCriteria;
  }

  private java.lang.Long taskId;

  /**
   * Gets the field taskId.
   * @return the value of the field taskId; may be null.
   */
  public java.lang.Long getTaskId()
  {
    return taskId;
  }

  /**
   * Sets the field taskId.
   * @param _taskId the new value of the field taskId.
   */
  public void setTaskId(java.lang.Long _taskId)
  {
    taskId = _taskId;
  }

  private java.lang.String caseName;

  /**
   * Gets the field caseName.
   * @return the value of the field caseName; may be null.
   */
  public java.lang.String getCaseName()
  {
    return caseName;
  }

  /**
   * Sets the field caseName.
   * @param _caseName the new value of the field caseName.
   */
  public void setCaseName(java.lang.String _caseName)
  {
    caseName = _caseName;
  }

  private ch.ivy.addon.portalkit.dto.GlobalCaseId caseId;

  /**
   * Gets the field caseId.
   * @return the value of the field caseId; may be null.
   */
  public ch.ivy.addon.portalkit.dto.GlobalCaseId getCaseId()
  {
    return caseId;
  }

  /**
   * Sets the field caseId.
   * @param _caseId the new value of the field caseId.
   */
  public void setCaseId(ch.ivy.addon.portalkit.dto.GlobalCaseId _caseId)
  {
    caseId = _caseId;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.RemoteCase> technicalCases;

  /**
   * Gets the field technicalCases.
   * @return the value of the field technicalCases; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.RemoteCase> getTechnicalCases()
  {
    return technicalCases;
  }

  /**
   * Sets the field technicalCases.
   * @param _technicalCases the new value of the field technicalCases.
   */
  public void setTechnicalCases(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.RemoteCase> _technicalCases)
  {
    technicalCases = _technicalCases;
  }

  private ch.ivy.ws.addon.CaseSearchCriteria caseSearchCriteria;

  /**
   * Gets the field caseSearchCriteria.
   * @return the value of the field caseSearchCriteria; may be null.
   */
  public ch.ivy.ws.addon.CaseSearchCriteria getCaseSearchCriteria()
  {
    return caseSearchCriteria;
  }

  /**
   * Sets the field caseSearchCriteria.
   * @param _caseSearchCriteria the new value of the field caseSearchCriteria.
   */
  public void setCaseSearchCriteria(ch.ivy.ws.addon.CaseSearchCriteria _caseSearchCriteria)
  {
    caseSearchCriteria = _caseSearchCriteria;
  }

  private ch.ivy.addon.portalkit.bo.RemoteCase selectedCase;

  /**
   * Gets the field selectedCase.
   * @return the value of the field selectedCase; may be null.
   */
  public ch.ivy.addon.portalkit.bo.RemoteCase getSelectedCase()
  {
    return selectedCase;
  }

  /**
   * Sets the field selectedCase.
   * @param _selectedCase the new value of the field selectedCase.
   */
  public void setSelectedCase(ch.ivy.addon.portalkit.bo.RemoteCase _selectedCase)
  {
    selectedCase = _selectedCase;
  }

  private ch.ivy.addon.portalkit.dto.GlobalCaseId selectedGlobalCaseId;

  /**
   * Gets the field selectedGlobalCaseId.
   * @return the value of the field selectedGlobalCaseId; may be null.
   */
  public ch.ivy.addon.portalkit.dto.GlobalCaseId getSelectedGlobalCaseId()
  {
    return selectedGlobalCaseId;
  }

  /**
   * Sets the field selectedGlobalCaseId.
   * @param _selectedGlobalCaseId the new value of the field selectedGlobalCaseId.
   */
  public void setSelectedGlobalCaseId(ch.ivy.addon.portalkit.dto.GlobalCaseId _selectedGlobalCaseId)
  {
    selectedGlobalCaseId = _selectedGlobalCaseId;
  }

}
