package ch.ivy.addon.portal.generic.TaskListNavigator;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class TaskListNavigatorData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskListNavigatorData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 6137110504454056132L;

  private ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel taskDataModel;

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

}
