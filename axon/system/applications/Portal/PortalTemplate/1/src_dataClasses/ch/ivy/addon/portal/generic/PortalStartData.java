package ch.ivy.addon.portal.generic;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class PortalStartData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PortalStartData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 5799853887579489951L;

  private transient ch.ivy.addon.portal.generic.navigation.PortalPage portalPage;

  /**
   * Gets the field portalPage.
   * @return the value of the field portalPage; may be null.
   */
  public ch.ivy.addon.portal.generic.navigation.PortalPage getPortalPage()
  {
    return portalPage;
  }

  /**
   * Sets the field portalPage.
   * @param _portalPage the new value of the field portalPage.
   */
  public void setPortalPage(ch.ivy.addon.portal.generic.navigation.PortalPage _portalPage)
  {
    portalPage = _portalPage;
  }

  private transient java.lang.String parameters;

  /**
   * Gets the field parameters.
   * @return the value of the field parameters; may be null.
   */
  public java.lang.String getParameters()
  {
    return parameters;
  }

  /**
   * Sets the field parameters.
   * @param _parameters the new value of the field parameters.
   */
  public void setParameters(java.lang.String _parameters)
  {
    parameters = _parameters;
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

  private transient java.lang.Number endedTaskId;

  /**
   * Gets the field endedTaskId.
   * @return the value of the field endedTaskId; may be null.
   */
  public java.lang.Number getEndedTaskId()
  {
    return endedTaskId;
  }

  /**
   * Sets the field endedTaskId.
   * @param _endedTaskId the new value of the field endedTaskId.
   */
  public void setEndedTaskId(java.lang.Number _endedTaskId)
  {
    endedTaskId = _endedTaskId;
  }

  private transient ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel dataModel;

  /**
   * Gets the field dataModel.
   * @return the value of the field dataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel getDataModel()
  {
    return dataModel;
  }

  /**
   * Sets the field dataModel.
   * @param _dataModel the new value of the field dataModel.
   */
  public void setDataModel(ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel _dataModel)
  {
    dataModel = _dataModel;
  }

  private transient java.lang.String keyword;

  /**
   * Gets the field keyword.
   * @return the value of the field keyword; may be null.
   */
  public java.lang.String getKeyword()
  {
    return keyword;
  }

  /**
   * Sets the field keyword.
   * @param _keyword the new value of the field keyword.
   */
  public void setKeyword(java.lang.String _keyword)
  {
    keyword = _keyword;
  }

  private transient java.lang.Number selectedTaskId;

  /**
   * Gets the field selectedTaskId.
   * @return the value of the field selectedTaskId; may be null.
   */
  public java.lang.Number getSelectedTaskId()
  {
    return selectedTaskId;
  }

  /**
   * Sets the field selectedTaskId.
   * @param _selectedTaskId the new value of the field selectedTaskId.
   */
  public void setSelectedTaskId(java.lang.Number _selectedTaskId)
  {
    selectedTaskId = _selectedTaskId;
  }

  private transient java.lang.Boolean compactMode;

  /**
   * Gets the field compactMode.
   * @return the value of the field compactMode; may be null.
   */
  public java.lang.Boolean getCompactMode()
  {
    return compactMode;
  }

  /**
   * Sets the field compactMode.
   * @param _compactMode the new value of the field compactMode.
   */
  public void setCompactMode(java.lang.Boolean _compactMode)
  {
    compactMode = _compactMode;
  }

  private transient java.lang.String callbackUrl;

  /**
   * Gets the field callbackUrl.
   * @return the value of the field callbackUrl; may be null.
   */
  public java.lang.String getCallbackUrl()
  {
    return callbackUrl;
  }

  /**
   * Sets the field callbackUrl.
   * @param _callbackUrl the new value of the field callbackUrl.
   */
  public void setCallbackUrl(java.lang.String _callbackUrl)
  {
    callbackUrl = _callbackUrl;
  }

  private transient java.lang.Boolean isDataModelInitialized;

  /**
   * Gets the field isDataModelInitialized.
   * @return the value of the field isDataModelInitialized; may be null.
   */
  public java.lang.Boolean getIsDataModelInitialized()
  {
    return isDataModelInitialized;
  }

  /**
   * Sets the field isDataModelInitialized.
   * @param _isDataModelInitialized the new value of the field isDataModelInitialized.
   */
  public void setIsDataModelInitialized(java.lang.Boolean _isDataModelInitialized)
  {
    isDataModelInitialized = _isDataModelInitialized;
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

}
