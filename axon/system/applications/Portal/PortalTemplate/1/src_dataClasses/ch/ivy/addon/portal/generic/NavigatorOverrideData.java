package ch.ivy.addon.portal.generic;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class NavigatorOverrideData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class NavigatorOverrideData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 9136326998187405028L;

  private transient ch.ivy.addon.portalkit.dto.GlobalCaseId caseId;

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

  private transient ch.ivy.addon.portal.generic.view.CaseView caseView;

  /**
   * Gets the field caseView.
   * @return the value of the field caseView; may be null.
   */
  public ch.ivy.addon.portal.generic.view.CaseView getCaseView()
  {
    return caseView;
  }

  /**
   * Sets the field caseView.
   * @param _caseView the new value of the field caseView.
   */
  public void setCaseView(ch.ivy.addon.portal.generic.view.CaseView _caseView)
  {
    caseView = _caseView;
  }

  private transient java.lang.String caseName;

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

  private transient ch.ivy.addon.portal.generic.view.TaskView taskView;

  /**
   * Gets the field taskView.
   * @return the value of the field taskView; may be null.
   */
  public ch.ivy.addon.portal.generic.view.TaskView getTaskView()
  {
    return taskView;
  }

  /**
   * Sets the field taskView.
   * @param _taskView the new value of the field taskView.
   */
  public void setTaskView(ch.ivy.addon.portal.generic.view.TaskView _taskView)
  {
    taskView = _taskView;
  }

  private transient java.lang.Long taskId;

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

  private transient java.lang.String thirdPartyAppName;

  /**
   * Gets the field thirdPartyAppName.
   * @return the value of the field thirdPartyAppName; may be null.
   */
  public java.lang.String getThirdPartyAppName()
  {
    return thirdPartyAppName;
  }

  /**
   * Sets the field thirdPartyAppName.
   * @param _thirdPartyAppName the new value of the field thirdPartyAppName.
   */
  public void setThirdPartyAppName(java.lang.String _thirdPartyAppName)
  {
    thirdPartyAppName = _thirdPartyAppName;
  }

  private transient java.lang.String thirdPartyAppUrl;

  /**
   * Gets the field thirdPartyAppUrl.
   * @return the value of the field thirdPartyAppUrl; may be null.
   */
  public java.lang.String getThirdPartyAppUrl()
  {
    return thirdPartyAppUrl;
  }

  /**
   * Sets the field thirdPartyAppUrl.
   * @param _thirdPartyAppUrl the new value of the field thirdPartyAppUrl.
   */
  public void setThirdPartyAppUrl(java.lang.String _thirdPartyAppUrl)
  {
    thirdPartyAppUrl = _thirdPartyAppUrl;
  }

  private transient ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel taskDataModel;

  /**
   * Gets the field taskDataModel.
   * @return the value of the field taskDataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel getTaskDataModel()
  {
    return taskDataModel;
  }

  /**
   * Sets the field taskDataModel.
   * @param _taskDataModel the new value of the field taskDataModel.
   */
  public void setTaskDataModel(ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel _taskDataModel)
  {
    taskDataModel = _taskDataModel;
  }

  private transient ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel caseDataModel;

  /**
   * Gets the field caseDataModel.
   * @return the value of the field caseDataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel getCaseDataModel()
  {
    return caseDataModel;
  }

  /**
   * Sets the field caseDataModel.
   * @param _caseDataModel the new value of the field caseDataModel.
   */
  public void setCaseDataModel(ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel _caseDataModel)
  {
    caseDataModel = _caseDataModel;
  }

  private transient ch.ivyteam.ivy.workflow.query.TaskQuery taskQuery;

  /**
   * Gets the field taskQuery.
   * @return the value of the field taskQuery; may be null.
   */
  public ch.ivyteam.ivy.workflow.query.TaskQuery getTaskQuery()
  {
    return taskQuery;
  }

  /**
   * Sets the field taskQuery.
   * @param _taskQuery the new value of the field taskQuery.
   */
  public void setTaskQuery(ch.ivyteam.ivy.workflow.query.TaskQuery _taskQuery)
  {
    taskQuery = _taskQuery;
  }

  private transient ch.ivyteam.ivy.workflow.query.CaseQuery caseQuery;

  /**
   * Gets the field caseQuery.
   * @return the value of the field caseQuery; may be null.
   */
  public ch.ivyteam.ivy.workflow.query.CaseQuery getCaseQuery()
  {
    return caseQuery;
  }

  /**
   * Sets the field caseQuery.
   * @param _caseQuery the new value of the field caseQuery.
   */
  public void setCaseQuery(ch.ivyteam.ivy.workflow.query.CaseQuery _caseQuery)
  {
    caseQuery = _caseQuery;
  }

  private transient java.lang.String chartName;

  /**
   * Gets the field chartName.
   * @return the value of the field chartName; may be null.
   */
  public java.lang.String getChartName()
  {
    return chartName;
  }

  /**
   * Sets the field chartName.
   * @param _chartName the new value of the field chartName.
   */
  public void setChartName(java.lang.String _chartName)
  {
    chartName = _chartName;
  }

}
