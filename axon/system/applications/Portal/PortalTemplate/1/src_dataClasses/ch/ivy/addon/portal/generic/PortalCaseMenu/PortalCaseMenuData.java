package ch.ivy.addon.portal.generic.PortalCaseMenu;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class PortalCaseMenuData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PortalCaseMenuData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -634847032213104070L;

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

  private java.lang.Boolean hasReadAllCasesPermisson;

  /**
   * Gets the field hasReadAllCasesPermisson.
   * @return the value of the field hasReadAllCasesPermisson; may be null.
   */
  public java.lang.Boolean getHasReadAllCasesPermisson()
  {
    return hasReadAllCasesPermisson;
  }

  /**
   * Sets the field hasReadAllCasesPermisson.
   * @param _hasReadAllCasesPermisson the new value of the field hasReadAllCasesPermisson.
   */
  public void setHasReadAllCasesPermisson(java.lang.Boolean _hasReadAllCasesPermisson)
  {
    hasReadAllCasesPermisson = _hasReadAllCasesPermisson;
  }

  private java.util.List<ch.ivy.ws.addon.CategoryData> myCaseCategories;

  /**
   * Gets the field myCaseCategories.
   * @return the value of the field myCaseCategories; may be null.
   */
  public java.util.List<ch.ivy.ws.addon.CategoryData> getMyCaseCategories()
  {
    return myCaseCategories;
  }

  /**
   * Sets the field myCaseCategories.
   * @param _myCaseCategories the new value of the field myCaseCategories.
   */
  public void setMyCaseCategories(java.util.List<ch.ivy.ws.addon.CategoryData> _myCaseCategories)
  {
    myCaseCategories = _myCaseCategories;
  }

  private java.util.List<ch.ivy.ws.addon.CategoryData> allCaseCategories;

  /**
   * Gets the field allCaseCategories.
   * @return the value of the field allCaseCategories; may be null.
   */
  public java.util.List<ch.ivy.ws.addon.CategoryData> getAllCaseCategories()
  {
    return allCaseCategories;
  }

  /**
   * Sets the field allCaseCategories.
   * @param _allCaseCategories the new value of the field allCaseCategories.
   */
  public void setAllCaseCategories(java.util.List<ch.ivy.ws.addon.CategoryData> _allCaseCategories)
  {
    allCaseCategories = _allCaseCategories;
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

  private ch.ivy.addon.portal.generic.view.CaseView caseView;

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

  private ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel dataModel;

  /**
   * Gets the field dataModel.
   * @return the value of the field dataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel getDataModel()
  {
    return dataModel;
  }

  /**
   * Sets the field dataModel.
   * @param _dataModel the new value of the field dataModel.
   */
  public void setDataModel(ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel _dataModel)
  {
    dataModel = _dataModel;
  }

}
