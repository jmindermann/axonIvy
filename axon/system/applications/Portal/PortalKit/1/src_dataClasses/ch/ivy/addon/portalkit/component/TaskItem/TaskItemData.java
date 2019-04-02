package ch.ivy.addon.portalkit.component.TaskItem;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class TaskItemData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskItemData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -7294993379202669954L;

  private ch.ivy.addon.portalkit.bo.RemoteTask task;

  /**
   * Gets the field task.
   * @return the value of the field task; may be null.
   */
  public ch.ivy.addon.portalkit.bo.RemoteTask getTask()
  {
    return task;
  }

  /**
   * Sets the field task.
   * @param _task the new value of the field task.
   */
  public void setTask(ch.ivy.addon.portalkit.bo.RemoteTask _task)
  {
    task = _task;
  }

  private java.lang.Boolean compactMode;

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

  private ch.ivy.addon.portalkit.bo.RemoteTask expandedTask;

  /**
   * Gets the field expandedTask.
   * @return the value of the field expandedTask; may be null.
   */
  public ch.ivy.addon.portalkit.bo.RemoteTask getExpandedTask()
  {
    return expandedTask;
  }

  /**
   * Sets the field expandedTask.
   * @param _expandedTask the new value of the field expandedTask.
   */
  public void setExpandedTask(ch.ivy.addon.portalkit.bo.RemoteTask _expandedTask)
  {
    expandedTask = _expandedTask;
  }

  private ch.ivy.addon.portalkit.bo.RemoteTask selectedTask;

  /**
   * Gets the field selectedTask.
   * @return the value of the field selectedTask; may be null.
   */
  public ch.ivy.addon.portalkit.bo.RemoteTask getSelectedTask()
  {
    return selectedTask;
  }

  /**
   * Sets the field selectedTask.
   * @param _selectedTask the new value of the field selectedTask.
   */
  public void setSelectedTask(ch.ivy.addon.portalkit.bo.RemoteTask _selectedTask)
  {
    selectedTask = _selectedTask;
  }

  private ch.ivy.addon.portalkit.persistence.domain.Server serverOfSelectedTask;

  /**
   * Gets the field serverOfSelectedTask.
   * @return the value of the field serverOfSelectedTask; may be null.
   */
  public ch.ivy.addon.portalkit.persistence.domain.Server getServerOfSelectedTask()
  {
    return serverOfSelectedTask;
  }

  /**
   * Sets the field serverOfSelectedTask.
   * @param _serverOfSelectedTask the new value of the field serverOfSelectedTask.
   */
  public void setServerOfSelectedTask(ch.ivy.addon.portalkit.persistence.domain.Server _serverOfSelectedTask)
  {
    serverOfSelectedTask = _serverOfSelectedTask;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WsException> errors;

  /**
   * Gets the field errors.
   * @return the value of the field errors; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WsException> getErrors()
  {
    return errors;
  }

  /**
   * Sets the field errors.
   * @param _errors the new value of the field errors.
   */
  public void setErrors(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WsException> _errors)
  {
    errors = _errors;
  }

  private ch.ivy.ws.addon.IvyRole selectedRole;

  /**
   * Gets the field selectedRole.
   * @return the value of the field selectedRole; may be null.
   */
  public ch.ivy.ws.addon.IvyRole getSelectedRole()
  {
    return selectedRole;
  }

  /**
   * Sets the field selectedRole.
   * @param _selectedRole the new value of the field selectedRole.
   */
  public void setSelectedRole(ch.ivy.ws.addon.IvyRole _selectedRole)
  {
    selectedRole = _selectedRole;
  }

  private ch.ivy.ws.addon.IvyUser selectedUser;

  /**
   * Gets the field selectedUser.
   * @return the value of the field selectedUser; may be null.
   */
  public ch.ivy.ws.addon.IvyUser getSelectedUser()
  {
    return selectedUser;
  }

  /**
   * Sets the field selectedUser.
   * @param _selectedUser the new value of the field selectedUser.
   */
  public void setSelectedUser(ch.ivy.ws.addon.IvyUser _selectedUser)
  {
    selectedUser = _selectedUser;
  }

  private java.lang.Boolean isUserDelegated;

  /**
   * Gets the field isUserDelegated.
   * @return the value of the field isUserDelegated; may be null.
   */
  public java.lang.Boolean getIsUserDelegated()
  {
    return isUserDelegated;
  }

  /**
   * Sets the field isUserDelegated.
   * @param _isUserDelegated the new value of the field isUserDelegated.
   */
  public void setIsUserDelegated(java.lang.Boolean _isUserDelegated)
  {
    isUserDelegated = _isUserDelegated;
  }

  private java.lang.Boolean disabledDelegateButton;

  /**
   * Gets the field disabledDelegateButton.
   * @return the value of the field disabledDelegateButton; may be null.
   */
  public java.lang.Boolean getDisabledDelegateButton()
  {
    return disabledDelegateButton;
  }

  /**
   * Sets the field disabledDelegateButton.
   * @param _disabledDelegateButton the new value of the field disabledDelegateButton.
   */
  public void setDisabledDelegateButton(java.lang.Boolean _disabledDelegateButton)
  {
    disabledDelegateButton = _disabledDelegateButton;
  }

  private ch.ivy.ws.addon.IvySecurityMember ivySecurityMember;

  /**
   * Gets the field ivySecurityMember.
   * @return the value of the field ivySecurityMember; may be null.
   */
  public ch.ivy.ws.addon.IvySecurityMember getIvySecurityMember()
  {
    return ivySecurityMember;
  }

  /**
   * Sets the field ivySecurityMember.
   * @param _ivySecurityMember the new value of the field ivySecurityMember.
   */
  public void setIvySecurityMember(ch.ivy.ws.addon.IvySecurityMember _ivySecurityMember)
  {
    ivySecurityMember = _ivySecurityMember;
  }

  private java.lang.Boolean canUserResumeTask;

  /**
   * Gets the field canUserResumeTask.
   * @return the value of the field canUserResumeTask; may be null.
   */
  public java.lang.Boolean getCanUserResumeTask()
  {
    return canUserResumeTask;
  }

  /**
   * Sets the field canUserResumeTask.
   * @param _canUserResumeTask the new value of the field canUserResumeTask.
   */
  public void setCanUserResumeTask(java.lang.Boolean _canUserResumeTask)
  {
    canUserResumeTask = _canUserResumeTask;
  }

  private ch.ivyteam.wf.processes.SecurityMemberData securityMemberData;

  /**
   * Gets the field securityMemberData.
   * @return the value of the field securityMemberData; may be null.
   */
  public ch.ivyteam.wf.processes.SecurityMemberData getSecurityMemberData()
  {
    return securityMemberData;
  }

  /**
   * Sets the field securityMemberData.
   * @param _securityMemberData the new value of the field securityMemberData.
   */
  public void setSecurityMemberData(ch.ivyteam.wf.processes.SecurityMemberData _securityMemberData)
  {
    securityMemberData = _securityMemberData;
  }

  private java.lang.String workerUserName;

  /**
   * Gets the field workerUserName.
   * @return the value of the field workerUserName; may be null.
   */
  public java.lang.String getWorkerUserName()
  {
    return workerUserName;
  }

  /**
   * Sets the field workerUserName.
   * @param _workerUserName the new value of the field workerUserName.
   */
  public void setWorkerUserName(java.lang.String _workerUserName)
  {
    workerUserName = _workerUserName;
  }

  private ch.ivy.ws.addon.IvyTask ivyTask;

  /**
   * Gets the field ivyTask.
   * @return the value of the field ivyTask; may be null.
   */
  public ch.ivy.ws.addon.IvyTask getIvyTask()
  {
    return ivyTask;
  }

  /**
   * Sets the field ivyTask.
   * @param _ivyTask the new value of the field ivyTask.
   */
  public void setIvyTask(ch.ivy.ws.addon.IvyTask _ivyTask)
  {
    ivyTask = _ivyTask;
  }

  private java.lang.String changeNameNoteContent;

  /**
   * Gets the field changeNameNoteContent.
   * @return the value of the field changeNameNoteContent; may be null.
   */
  public java.lang.String getChangeNameNoteContent()
  {
    return changeNameNoteContent;
  }

  /**
   * Sets the field changeNameNoteContent.
   * @param _changeNameNoteContent the new value of the field changeNameNoteContent.
   */
  public void setChangeNameNoteContent(java.lang.String _changeNameNoteContent)
  {
    changeNameNoteContent = _changeNameNoteContent;
  }

  private java.lang.String oldName;

  /**
   * Gets the field oldName.
   * @return the value of the field oldName; may be null.
   */
  public java.lang.String getOldName()
  {
    return oldName;
  }

  /**
   * Sets the field oldName.
   * @param _oldName the new value of the field oldName.
   */
  public void setOldName(java.lang.String _oldName)
  {
    oldName = _oldName;
  }

  private java.lang.Boolean IsValidStatesToReset;

  /**
   * Gets the field IsValidStatesToReset.
   * @return the value of the field IsValidStatesToReset; may be null.
   */
  public java.lang.Boolean getIsValidStatesToReset()
  {
    return IsValidStatesToReset;
  }

  /**
   * Sets the field IsValidStatesToReset.
   * @param _IsValidStatesToReset the new value of the field IsValidStatesToReset.
   */
  public void setIsValidStatesToReset(java.lang.Boolean _IsValidStatesToReset)
  {
    IsValidStatesToReset = _IsValidStatesToReset;
  }

  private java.lang.String delegateComment;

  /**
   * Gets the field delegateComment.
   * @return the value of the field delegateComment; may be null.
   */
  public java.lang.String getDelegateComment()
  {
    return delegateComment;
  }

  /**
   * Sets the field delegateComment.
   * @param _delegateComment the new value of the field delegateComment.
   */
  public void setDelegateComment(java.lang.String _delegateComment)
  {
    delegateComment = _delegateComment;
  }

  private java.lang.Boolean canDelegateTask;

  /**
   * Gets the field canDelegateTask.
   * @return the value of the field canDelegateTask; may be null.
   */
  public java.lang.Boolean getCanDelegateTask()
  {
    return canDelegateTask;
  }

  /**
   * Sets the field canDelegateTask.
   * @param _canDelegateTask the new value of the field canDelegateTask.
   */
  public void setCanDelegateTask(java.lang.Boolean _canDelegateTask)
  {
    canDelegateTask = _canDelegateTask;
  }

  /**
   * Portal Task List url is used to be back after finish task
   */
  private java.lang.String callbackUrl;

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

  private java.util.List<ch.ivy.addon.portalkit.bo.RemoteSideStep> sideSteps;

  /**
   * Gets the field sideSteps.
   * @return the value of the field sideSteps; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.bo.RemoteSideStep> getSideSteps()
  {
    return sideSteps;
  }

  /**
   * Sets the field sideSteps.
   * @param _sideSteps the new value of the field sideSteps.
   */
  public void setSideSteps(java.util.List<ch.ivy.addon.portalkit.bo.RemoteSideStep> _sideSteps)
  {
    sideSteps = _sideSteps;
  }

  private ch.ivy.ws.addon.SideStepSearchCriteria sideStepSearchCriteria;

  /**
   * Gets the field sideStepSearchCriteria.
   * @return the value of the field sideStepSearchCriteria; may be null.
   */
  public ch.ivy.ws.addon.SideStepSearchCriteria getSideStepSearchCriteria()
  {
    return sideStepSearchCriteria;
  }

  /**
   * Sets the field sideStepSearchCriteria.
   * @param _sideStepSearchCriteria the new value of the field sideStepSearchCriteria.
   */
  public void setSideStepSearchCriteria(ch.ivy.ws.addon.SideStepSearchCriteria _sideStepSearchCriteria)
  {
    sideStepSearchCriteria = _sideStepSearchCriteria;
  }

  private java.lang.String startLink;

  /**
   * Gets the field startLink.
   * @return the value of the field startLink; may be null.
   */
  public java.lang.String getStartLink()
  {
    return startLink;
  }

  /**
   * Sets the field startLink.
   * @param _startLink the new value of the field startLink.
   */
  public void setStartLink(java.lang.String _startLink)
  {
    startLink = _startLink;
  }

  private java.lang.Boolean isShowTaskButtonLabels;

  /**
   * Gets the field isShowTaskButtonLabels.
   * @return the value of the field isShowTaskButtonLabels; may be null.
   */
  public java.lang.Boolean getIsShowTaskButtonLabels()
  {
    return isShowTaskButtonLabels;
  }

  /**
   * Sets the field isShowTaskButtonLabels.
   * @param _isShowTaskButtonLabels the new value of the field isShowTaskButtonLabels.
   */
  public void setIsShowTaskButtonLabels(java.lang.Boolean _isShowTaskButtonLabels)
  {
    isShowTaskButtonLabels = _isShowTaskButtonLabels;
  }

  private java.lang.String queryAutoComplete;

  /**
   * Gets the field queryAutoComplete.
   * @return the value of the field queryAutoComplete; may be null.
   */
  public java.lang.String getQueryAutoComplete()
  {
    return queryAutoComplete;
  }

  /**
   * Sets the field queryAutoComplete.
   * @param _queryAutoComplete the new value of the field queryAutoComplete.
   */
  public void setQueryAutoComplete(java.lang.String _queryAutoComplete)
  {
    queryAutoComplete = _queryAutoComplete;
  }

  private ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel dataModel;

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

}
