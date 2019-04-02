package ch.ivy.addon.portal.generic.CaseSearchResult;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class CaseSearchResultData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CaseSearchResultData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 467700413808282184L;

  private ch.ivy.addon.portal.generic.view.CaseView view;

  /**
   * Gets the field view.
   * @return the value of the field view; may be null.
   */
  public ch.ivy.addon.portal.generic.view.CaseView getView()
  {
    return view;
  }

  /**
   * Sets the field view.
   * @param _view the new value of the field view.
   */
  public void setView(ch.ivy.addon.portal.generic.view.CaseView _view)
  {
    view = _view;
  }

  private ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel caseDataModel;

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
