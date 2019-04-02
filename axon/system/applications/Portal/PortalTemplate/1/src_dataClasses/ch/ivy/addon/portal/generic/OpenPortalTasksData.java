package ch.ivy.addon.portal.generic;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class OpenPortalTasksData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class OpenPortalTasksData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -8848392843375131901L;

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

}
