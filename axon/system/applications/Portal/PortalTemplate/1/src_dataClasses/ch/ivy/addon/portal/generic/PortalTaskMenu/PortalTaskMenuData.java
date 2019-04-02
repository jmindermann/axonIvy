package ch.ivy.addon.portal.generic.PortalTaskMenu;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class PortalTaskMenuData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PortalTaskMenuData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4116095461212805736L;

  private java.lang.String loginUser;

  /**
   * Gets the field loginUser.
   * @return the value of the field loginUser; may be null.
   */
  public java.lang.String getLoginUser()
  {
    return loginUser;
  }

  /**
   * Sets the field loginUser.
   * @param _loginUser the new value of the field loginUser.
   */
  public void setLoginUser(java.lang.String _loginUser)
  {
    loginUser = _loginUser;
  }

  private java.lang.Boolean hasReadAllTasksPermisson;

  /**
   * Gets the field hasReadAllTasksPermisson.
   * @return the value of the field hasReadAllTasksPermisson; may be null.
   */
  public java.lang.Boolean getHasReadAllTasksPermisson()
  {
    return hasReadAllTasksPermisson;
  }

  /**
   * Sets the field hasReadAllTasksPermisson.
   * @param _hasReadAllTasksPermisson the new value of the field hasReadAllTasksPermisson.
   */
  public void setHasReadAllTasksPermisson(java.lang.Boolean _hasReadAllTasksPermisson)
  {
    hasReadAllTasksPermisson = _hasReadAllTasksPermisson;
  }

  private java.util.List<ch.ivy.ws.addon.CategoryData> myTaskCategories;

  /**
   * Gets the field myTaskCategories.
   * @return the value of the field myTaskCategories; may be null.
   */
  public java.util.List<ch.ivy.ws.addon.CategoryData> getMyTaskCategories()
  {
    return myTaskCategories;
  }

  /**
   * Sets the field myTaskCategories.
   * @param _myTaskCategories the new value of the field myTaskCategories.
   */
  public void setMyTaskCategories(java.util.List<ch.ivy.ws.addon.CategoryData> _myTaskCategories)
  {
    myTaskCategories = _myTaskCategories;
  }

  private java.util.List<ch.ivy.ws.addon.CategoryData> allTaskCategories;

  /**
   * Gets the field allTaskCategories.
   * @return the value of the field allTaskCategories; may be null.
   */
  public java.util.List<ch.ivy.ws.addon.CategoryData> getAllTaskCategories()
  {
    return allTaskCategories;
  }

  /**
   * Sets the field allTaskCategories.
   * @param _allTaskCategories the new value of the field allTaskCategories.
   */
  public void setAllTaskCategories(java.util.List<ch.ivy.ws.addon.CategoryData> _allTaskCategories)
  {
    allTaskCategories = _allTaskCategories;
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

  private ch.ivy.addon.portal.generic.view.TaskView taskView;

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

  private ch.ivy.addon.portalkit.bo.MainMenuNode selectedMenuItem;

  /**
   * Gets the field selectedMenuItem.
   * @return the value of the field selectedMenuItem; may be null.
   */
  public ch.ivy.addon.portalkit.bo.MainMenuNode getSelectedMenuItem()
  {
    return selectedMenuItem;
  }

  /**
   * Sets the field selectedMenuItem.
   * @param _selectedMenuItem the new value of the field selectedMenuItem.
   */
  public void setSelectedMenuItem(ch.ivy.addon.portalkit.bo.MainMenuNode _selectedMenuItem)
  {
    selectedMenuItem = _selectedMenuItem;
  }

  private org.primefaces.model.DefaultTreeNode selectedNode;

  /**
   * Gets the field selectedNode.
   * @return the value of the field selectedNode; may be null.
   */
  public org.primefaces.model.DefaultTreeNode getSelectedNode()
  {
    return selectedNode;
  }

  /**
   * Sets the field selectedNode.
   * @param _selectedNode the new value of the field selectedNode.
   */
  public void setSelectedNode(org.primefaces.model.DefaultTreeNode _selectedNode)
  {
    selectedNode = _selectedNode;
  }

  private ch.ivyteam.ivy.scripting.objects.List<java.lang.String> involvedApplications;

  /**
   * Gets the field involvedApplications.
   * @return the value of the field involvedApplications; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getInvolvedApplications()
  {
    return involvedApplications;
  }

  /**
   * Sets the field involvedApplications.
   * @param _involvedApplications the new value of the field involvedApplications.
   */
  public void setInvolvedApplications(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _involvedApplications)
  {
    involvedApplications = _involvedApplications;
  }

  private java.util.List<ch.ivy.ws.addon.CategoryData> groupTaskCategories;

  /**
   * Gets the field groupTaskCategories.
   * @return the value of the field groupTaskCategories; may be null.
   */
  public java.util.List<ch.ivy.ws.addon.CategoryData> getGroupTaskCategories()
  {
    return groupTaskCategories;
  }

  /**
   * Sets the field groupTaskCategories.
   * @param _groupTaskCategories the new value of the field groupTaskCategories.
   */
  public void setGroupTaskCategories(java.util.List<ch.ivy.ws.addon.CategoryData> _groupTaskCategories)
  {
    groupTaskCategories = _groupTaskCategories;
  }

  /**
   * Customized TaskQuery
   */
  private java.lang.String jsonQuery;

  /**
   * Gets the field jsonQuery.
   * @return the value of the field jsonQuery; may be null.
   */
  public java.lang.String getJsonQuery()
  {
    return jsonQuery;
  }

  /**
   * Sets the field jsonQuery.
   * @param _jsonQuery the new value of the field jsonQuery.
   */
  public void setJsonQuery(java.lang.String _jsonQuery)
  {
    jsonQuery = _jsonQuery;
  }

  private java.util.List<ch.ivy.ws.addon.CategoryData> unassignedTaskCategories;

  /**
   * Gets the field unassignedTaskCategories.
   * @return the value of the field unassignedTaskCategories; may be null.
   */
  public java.util.List<ch.ivy.ws.addon.CategoryData> getUnassignedTaskCategories()
  {
    return unassignedTaskCategories;
  }

  /**
   * Sets the field unassignedTaskCategories.
   * @param _unassignedTaskCategories the new value of the field unassignedTaskCategories.
   */
  public void setUnassignedTaskCategories(java.util.List<ch.ivy.ws.addon.CategoryData> _unassignedTaskCategories)
  {
    unassignedTaskCategories = _unassignedTaskCategories;
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
