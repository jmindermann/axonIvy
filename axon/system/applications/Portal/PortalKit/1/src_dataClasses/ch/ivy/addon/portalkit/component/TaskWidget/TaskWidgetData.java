package ch.ivy.addon.portalkit.component.TaskWidget;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class TaskWidgetData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskWidgetData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 1463907757415001356L;

  private java.lang.Integer count;

  /**
   * Gets the field count.
   * @return the value of the field count; may be null.
   */
  public java.lang.Integer getCount()
  {
    return count;
  }

  /**
   * Sets the field count.
   * @param _count the new value of the field count.
   */
  public void setCount(java.lang.Integer _count)
  {
    count = _count;
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

  private java.lang.Integer startIndex;

  /**
   * Gets the field startIndex.
   * @return the value of the field startIndex; may be null.
   */
  public java.lang.Integer getStartIndex()
  {
    return startIndex;
  }

  /**
   * Sets the field startIndex.
   * @param _startIndex the new value of the field startIndex.
   */
  public void setStartIndex(java.lang.Integer _startIndex)
  {
    startIndex = _startIndex;
  }

  private java.lang.Long taskCount;

  /**
   * Gets the field taskCount.
   * @return the value of the field taskCount; may be null.
   */
  public java.lang.Long getTaskCount()
  {
    return taskCount;
  }

  /**
   * Sets the field taskCount.
   * @param _taskCount the new value of the field taskCount.
   */
  public void setTaskCount(java.lang.Long _taskCount)
  {
    taskCount = _taskCount;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.RemoteTask> tasks;

  /**
   * Gets the field tasks.
   * @return the value of the field tasks; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.RemoteTask> getTasks()
  {
    return tasks;
  }

  /**
   * Sets the field tasks.
   * @param _tasks the new value of the field tasks.
   */
  public void setTasks(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.RemoteTask> _tasks)
  {
    tasks = _tasks;
  }

  private ch.ivy.ws.addon.TaskSearchCriteria taskSearchCriteria;

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

  private java.lang.String sortField;

  /**
   * Gets the field sortField.
   * @return the value of the field sortField; may be null.
   */
  public java.lang.String getSortField()
  {
    return sortField;
  }

  /**
   * Sets the field sortField.
   * @param _sortField the new value of the field sortField.
   */
  public void setSortField(java.lang.String _sortField)
  {
    sortField = _sortField;
  }

  private java.lang.Boolean sortDescending;

  /**
   * Gets the field sortDescending.
   * @return the value of the field sortDescending; may be null.
   */
  public java.lang.Boolean getSortDescending()
  {
    return sortDescending;
  }

  /**
   * Sets the field sortDescending.
   * @param _sortDescending the new value of the field sortDescending.
   */
  public void setSortDescending(java.lang.Boolean _sortDescending)
  {
    sortDescending = _sortDescending;
  }

  private java.lang.Long serverId;

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

  private java.lang.String filterSetName;

  /**
   * Gets the field filterSetName.
   * @return the value of the field filterSetName; may be null.
   */
  public java.lang.String getFilterSetName()
  {
    return filterSetName;
  }

  /**
   * Sets the field filterSetName.
   * @param _filterSetName the new value of the field filterSetName.
   */
  public void setFilterSetName(java.lang.String _filterSetName)
  {
    filterSetName = _filterSetName;
  }

  private ch.ivy.addon.portalkit.enums.FilterType filterType;

  /**
   * Gets the field filterType.
   * @return the value of the field filterType; may be null.
   */
  public ch.ivy.addon.portalkit.enums.FilterType getFilterType()
  {
    return filterType;
  }

  /**
   * Sets the field filterType.
   * @param _filterType the new value of the field filterType.
   */
  public void setFilterType(ch.ivy.addon.portalkit.enums.FilterType _filterType)
  {
    filterType = _filterType;
  }

  private ch.ivy.addon.portalkit.taskfilter.TaskFilterData taskFilterDataToBeRemoved;

  /**
   * Gets the field taskFilterDataToBeRemoved.
   * @return the value of the field taskFilterDataToBeRemoved; may be null.
   */
  public ch.ivy.addon.portalkit.taskfilter.TaskFilterData getTaskFilterDataToBeRemoved()
  {
    return taskFilterDataToBeRemoved;
  }

  /**
   * Sets the field taskFilterDataToBeRemoved.
   * @param _taskFilterDataToBeRemoved the new value of the field taskFilterDataToBeRemoved.
   */
  public void setTaskFilterDataToBeRemoved(ch.ivy.addon.portalkit.taskfilter.TaskFilterData _taskFilterDataToBeRemoved)
  {
    taskFilterDataToBeRemoved = _taskFilterDataToBeRemoved;
  }

  private java.lang.Boolean isFilterExisted;

  /**
   * Gets the field isFilterExisted.
   * @return the value of the field isFilterExisted; may be null.
   */
  public java.lang.Boolean getIsFilterExisted()
  {
    return isFilterExisted;
  }

  /**
   * Sets the field isFilterExisted.
   * @param _isFilterExisted the new value of the field isFilterExisted.
   */
  public void setIsFilterExisted(java.lang.Boolean _isFilterExisted)
  {
    isFilterExisted = _isFilterExisted;
  }

  private java.lang.Long taskFilterGroupId;

  /**
   * Gets the field taskFilterGroupId.
   * @return the value of the field taskFilterGroupId; may be null.
   */
  public java.lang.Long getTaskFilterGroupId()
  {
    return taskFilterGroupId;
  }

  /**
   * Sets the field taskFilterGroupId.
   * @param _taskFilterGroupId the new value of the field taskFilterGroupId.
   */
  public void setTaskFilterGroupId(java.lang.Long _taskFilterGroupId)
  {
    taskFilterGroupId = _taskFilterGroupId;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.taskfilter.TaskFilterData> taskPublicFilters;

  /**
   * Gets the field taskPublicFilters.
   * @return the value of the field taskPublicFilters; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.taskfilter.TaskFilterData> getTaskPublicFilters()
  {
    return taskPublicFilters;
  }

  /**
   * Sets the field taskPublicFilters.
   * @param _taskPublicFilters the new value of the field taskPublicFilters.
   */
  public void setTaskPublicFilters(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.taskfilter.TaskFilterData> _taskPublicFilters)
  {
    taskPublicFilters = _taskPublicFilters;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.taskfilter.TaskFilterData> taskPrivateFilters;

  /**
   * Gets the field taskPrivateFilters.
   * @return the value of the field taskPrivateFilters; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.taskfilter.TaskFilterData> getTaskPrivateFilters()
  {
    return taskPrivateFilters;
  }

  /**
   * Sets the field taskPrivateFilters.
   * @param _taskPrivateFilters the new value of the field taskPrivateFilters.
   */
  public void setTaskPrivateFilters(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.taskfilter.TaskFilterData> _taskPrivateFilters)
  {
    taskPrivateFilters = _taskPrivateFilters;
  }

  private java.util.List<ch.ivy.addon.portalkit.bo.RemoteTask> latestTasks;

  /**
   * Gets the field latestTasks.
   * @return the value of the field latestTasks; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.bo.RemoteTask> getLatestTasks()
  {
    return latestTasks;
  }

  /**
   * Sets the field latestTasks.
   * @param _latestTasks the new value of the field latestTasks.
   */
  public void setLatestTasks(java.util.List<ch.ivy.addon.portalkit.bo.RemoteTask> _latestTasks)
  {
    latestTasks = _latestTasks;
  }

  private java.util.Date latestTaskDate;

  /**
   * Gets the field latestTaskDate.
   * @return the value of the field latestTaskDate; may be null.
   */
  public java.util.Date getLatestTaskDate()
  {
    return latestTaskDate;
  }

  /**
   * Sets the field latestTaskDate.
   * @param _latestTaskDate the new value of the field latestTaskDate.
   */
  public void setLatestTaskDate(java.util.Date _latestTaskDate)
  {
    latestTaskDate = _latestTaskDate;
  }

  private ch.ivy.ws.addon.TaskSearchCriteria newTaskSearchCriteria;

  /**
   * Gets the field newTaskSearchCriteria.
   * @return the value of the field newTaskSearchCriteria; may be null.
   */
  public ch.ivy.ws.addon.TaskSearchCriteria getNewTaskSearchCriteria()
  {
    return newTaskSearchCriteria;
  }

  /**
   * Sets the field newTaskSearchCriteria.
   * @param _newTaskSearchCriteria the new value of the field newTaskSearchCriteria.
   */
  public void setNewTaskSearchCriteria(ch.ivy.ws.addon.TaskSearchCriteria _newTaskSearchCriteria)
  {
    newTaskSearchCriteria = _newTaskSearchCriteria;
  }

  private java.lang.Long numberOfNewTask;

  /**
   * Gets the field numberOfNewTask.
   * @return the value of the field numberOfNewTask; may be null.
   */
  public java.lang.Long getNumberOfNewTask()
  {
    return numberOfNewTask;
  }

  /**
   * Sets the field numberOfNewTask.
   * @param _numberOfNewTask the new value of the field numberOfNewTask.
   */
  public void setNumberOfNewTask(java.lang.Long _numberOfNewTask)
  {
    numberOfNewTask = _numberOfNewTask;
  }

  private java.lang.Integer scrollPosition;

  /**
   * Gets the field scrollPosition.
   * @return the value of the field scrollPosition; may be null.
   */
  public java.lang.Integer getScrollPosition()
  {
    return scrollPosition;
  }

  /**
   * Sets the field scrollPosition.
   * @param _scrollPosition the new value of the field scrollPosition.
   */
  public void setScrollPosition(java.lang.Integer _scrollPosition)
  {
    scrollPosition = _scrollPosition;
  }

  private java.lang.Long expandedTaskId;

  /**
   * Gets the field expandedTaskId.
   * @return the value of the field expandedTaskId; may be null.
   */
  public java.lang.Long getExpandedTaskId()
  {
    return expandedTaskId;
  }

  /**
   * Sets the field expandedTaskId.
   * @param _expandedTaskId the new value of the field expandedTaskId.
   */
  public void setExpandedTaskId(java.lang.Long _expandedTaskId)
  {
    expandedTaskId = _expandedTaskId;
  }

}
