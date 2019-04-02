package ch.ivy.addon.portal.generic.TaskSearchResult;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class TaskSearchResultData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskSearchResultData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -350258904160567580L;

  private ch.ivy.addon.portal.generic.view.TaskView view;

  /**
   * Gets the field view.
   * @return the value of the field view; may be null.
   */
  public ch.ivy.addon.portal.generic.view.TaskView getView()
  {
    return view;
  }

  /**
   * Sets the field view.
   * @param _view the new value of the field view.
   */
  public void setView(ch.ivy.addon.portal.generic.view.TaskView _view)
  {
    view = _view;
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

  private java.lang.String keyword;

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

  private ch.ivy.addon.portalkit.bo.RemoteTask foundTask;

  /**
   * Gets the field foundTask.
   * @return the value of the field foundTask; may be null.
   */
  public ch.ivy.addon.portalkit.bo.RemoteTask getFoundTask()
  {
    return foundTask;
  }

  /**
   * Sets the field foundTask.
   * @param _foundTask the new value of the field foundTask.
   */
  public void setFoundTask(ch.ivy.addon.portalkit.bo.RemoteTask _foundTask)
  {
    foundTask = _foundTask;
  }

}
