package ch.ivy.addon.portalkit.component.task.column.TaskName;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class TaskNameData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskNameData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -4810066177572976484L;

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

}
