package ch.ivy.addon.portal.generic;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class TaskNoteHistoryData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskNoteHistoryData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 391077953845714290L;

  private transient java.lang.Long remoteTaskId;

  /**
   * Gets the field remoteTaskId.
   * @return the value of the field remoteTaskId; may be null.
   */
  public java.lang.Long getRemoteTaskId()
  {
    return remoteTaskId;
  }

  /**
   * Sets the field remoteTaskId.
   * @param _remoteTaskId the new value of the field remoteTaskId.
   */
  public void setRemoteTaskId(java.lang.Long _remoteTaskId)
  {
    remoteTaskId = _remoteTaskId;
  }

  private transient ch.ivy.addon.portalkit.bo.RemoteTask remoteTask;

  /**
   * Gets the field remoteTask.
   * @return the value of the field remoteTask; may be null.
   */
  public ch.ivy.addon.portalkit.bo.RemoteTask getRemoteTask()
  {
    return remoteTask;
  }

  /**
   * Sets the field remoteTask.
   * @param _remoteTask the new value of the field remoteTask.
   */
  public void setRemoteTask(ch.ivy.addon.portalkit.bo.RemoteTask _remoteTask)
  {
    remoteTask = _remoteTask;
  }

  private transient ch.ivy.ws.addon.TaskSearchCriteria taskSearchCriteria;

  /**
   * Gets the field taskSearchCriteria.
   * @return the value of the field taskSearchCriteria; may be null.
   */
  public ch.ivy.ws.addon.TaskSearchCriteria getTaskSearchCriteria()
  {
    return taskSearchCriteria;
  }

  /**
   * Sets the field taskSearchCriteria.
   * @param _taskSearchCriteria the new value of the field taskSearchCriteria.
   */
  public void setTaskSearchCriteria(ch.ivy.ws.addon.TaskSearchCriteria _taskSearchCriteria)
  {
    taskSearchCriteria = _taskSearchCriteria;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyNote> notes;

  /**
   * Gets the field notes.
   * @return the value of the field notes; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyNote> getNotes()
  {
    return notes;
  }

  /**
   * Sets the field notes.
   * @param _notes the new value of the field notes.
   */
  public void setNotes(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyNote> _notes)
  {
    notes = _notes;
  }

  private transient java.lang.Long serverId;

  /**
   * Gets the field serverId.
   * @return the value of the field serverId; may be null.
   */
  public java.lang.Long getServerId()
  {
    return serverId;
  }

  /**
   * Sets the field serverId.
   * @param _serverId the new value of the field serverId.
   */
  public void setServerId(java.lang.Long _serverId)
  {
    serverId = _serverId;
  }

}
