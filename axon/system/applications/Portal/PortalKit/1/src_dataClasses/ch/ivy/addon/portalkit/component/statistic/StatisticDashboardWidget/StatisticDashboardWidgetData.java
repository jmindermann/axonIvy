package ch.ivy.addon.portalkit.component.statistic.StatisticDashboardWidget;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class StatisticDashboardWidgetData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class StatisticDashboardWidgetData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 9123549114829339238L;

  private ch.ivy.addon.portalkit.statistics.StatisticChart selectedStatisticChart;

  /**
   * Gets the field selectedStatisticChart.
   * @return the value of the field selectedStatisticChart; may be null.
   */
  public ch.ivy.addon.portalkit.statistics.StatisticChart getSelectedStatisticChart()
  {
    return selectedStatisticChart;
  }

  /**
   * Sets the field selectedStatisticChart.
   * @param _selectedStatisticChart the new value of the field selectedStatisticChart.
   */
  public void setSelectedStatisticChart(ch.ivy.addon.portalkit.statistics.StatisticChart _selectedStatisticChart)
  {
    selectedStatisticChart = _selectedStatisticChart;
  }

  private org.primefaces.event.ItemSelectEvent event;

  /**
   * Gets the field event.
   * @return the value of the field event; may be null.
   */
  public org.primefaces.event.ItemSelectEvent getEvent()
  {
    return event;
  }

  /**
   * Sets the field event.
   * @param _event the new value of the field event.
   */
  public void setEvent(org.primefaces.event.ItemSelectEvent _event)
  {
    event = _event;
  }

  private java.util.List<ch.ivy.addon.portalkit.statistics.StatisticChart> statisticChartList;

  /**
   * Gets the field statisticChartList.
   * @return the value of the field statisticChartList; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.statistics.StatisticChart> getStatisticChartList()
  {
    return statisticChartList;
  }

  /**
   * Sets the field statisticChartList.
   * @param _statisticChartList the new value of the field statisticChartList.
   */
  public void setStatisticChartList(java.util.List<ch.ivy.addon.portalkit.statistics.StatisticChart> _statisticChartList)
  {
    statisticChartList = _statisticChartList;
  }

  private ch.ivyteam.ivy.workflow.query.TaskQuery taskQuery;

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

  private ch.ivyteam.ivy.workflow.query.CaseQuery caseQuery;

  /**
   * Gets the field caseQuery.
   * @return the value of the field caseQuery; may be null.
   */
  public ch.ivyteam.ivy.workflow.query.CaseQuery getCaseQuery()
  {
    return caseQuery;
  }

  /**
   * Sets the field caseQuery.
   * @param _caseQuery the new value of the field caseQuery.
   */
  public void setCaseQuery(ch.ivyteam.ivy.workflow.query.CaseQuery _caseQuery)
  {
    caseQuery = _caseQuery;
  }

  private java.lang.Boolean hasStatistic;

  /**
   * Gets the field hasStatistic.
   * @return the value of the field hasStatistic; may be null.
   */
  public java.lang.Boolean getHasStatistic()
  {
    return hasStatistic;
  }

  /**
   * Sets the field hasStatistic.
   * @param _hasStatistic the new value of the field hasStatistic.
   */
  public void setHasStatistic(java.lang.Boolean _hasStatistic)
  {
    hasStatistic = _hasStatistic;
  }

  private java.lang.String selectedItemOfDrilldown;

  /**
   * Gets the field selectedItemOfDrilldown.
   * @return the value of the field selectedItemOfDrilldown; may be null.
   */
  public java.lang.String getSelectedItemOfDrilldown()
  {
    return selectedItemOfDrilldown;
  }

  /**
   * Sets the field selectedItemOfDrilldown.
   * @param _selectedItemOfDrilldown the new value of the field selectedItemOfDrilldown.
   */
  public void setSelectedItemOfDrilldown(java.lang.String _selectedItemOfDrilldown)
  {
    selectedItemOfDrilldown = _selectedItemOfDrilldown;
  }

  private java.lang.Boolean isDrilldownToTaskList;

  /**
   * Gets the field isDrilldownToTaskList.
   * @return the value of the field isDrilldownToTaskList; may be null.
   */
  public java.lang.Boolean getIsDrilldownToTaskList()
  {
    return isDrilldownToTaskList;
  }

  /**
   * Sets the field isDrilldownToTaskList.
   * @param _isDrilldownToTaskList the new value of the field isDrilldownToTaskList.
   */
  public void setIsDrilldownToTaskList(java.lang.Boolean _isDrilldownToTaskList)
  {
    isDrilldownToTaskList = _isDrilldownToTaskList;
  }

  private java.lang.String selectedCaseCategory;

  /**
   * Gets the field selectedCaseCategory.
   * @return the value of the field selectedCaseCategory; may be null.
   */
  public java.lang.String getSelectedCaseCategory()
  {
    return selectedCaseCategory;
  }

  /**
   * Sets the field selectedCaseCategory.
   * @param _selectedCaseCategory the new value of the field selectedCaseCategory.
   */
  public void setSelectedCaseCategory(java.lang.String _selectedCaseCategory)
  {
    selectedCaseCategory = _selectedCaseCategory;
  }

  private java.lang.String previousSelectedMonth;

  /**
   * Gets the field previousSelectedMonth.
   * @return the value of the field previousSelectedMonth; may be null.
   */
  public java.lang.String getPreviousSelectedMonth()
  {
    return previousSelectedMonth;
  }

  /**
   * Sets the field previousSelectedMonth.
   * @param _previousSelectedMonth the new value of the field previousSelectedMonth.
   */
  public void setPreviousSelectedMonth(java.lang.String _previousSelectedMonth)
  {
    previousSelectedMonth = _previousSelectedMonth;
  }

  private java.lang.String previousSelectedWeek;

  /**
   * Gets the field previousSelectedWeek.
   * @return the value of the field previousSelectedWeek; may be null.
   */
  public java.lang.String getPreviousSelectedWeek()
  {
    return previousSelectedWeek;
  }

  /**
   * Sets the field previousSelectedWeek.
   * @param _previousSelectedWeek the new value of the field previousSelectedWeek.
   */
  public void setPreviousSelectedWeek(java.lang.String _previousSelectedWeek)
  {
    previousSelectedWeek = _previousSelectedWeek;
  }

  private java.lang.String previousSelectedDay;

  /**
   * Gets the field previousSelectedDay.
   * @return the value of the field previousSelectedDay; may be null.
   */
  public java.lang.String getPreviousSelectedDay()
  {
    return previousSelectedDay;
  }

  /**
   * Sets the field previousSelectedDay.
   * @param _previousSelectedDay the new value of the field previousSelectedDay.
   */
  public void setPreviousSelectedDay(java.lang.String _previousSelectedDay)
  {
    previousSelectedDay = _previousSelectedDay;
  }

  private java.lang.Boolean showTaskListImmediately;

  /**
   * Gets the field showTaskListImmediately.
   * @return the value of the field showTaskListImmediately; may be null.
   */
  public java.lang.Boolean getShowTaskListImmediately()
  {
    return showTaskListImmediately;
  }

  /**
   * Sets the field showTaskListImmediately.
   * @param _showTaskListImmediately the new value of the field showTaskListImmediately.
   */
  public void setShowTaskListImmediately(java.lang.Boolean _showTaskListImmediately)
  {
    showTaskListImmediately = _showTaskListImmediately;
  }

  private java.lang.String taskListName;

  /**
   * Gets the field taskListName.
   * @return the value of the field taskListName; may be null.
   */
  public java.lang.String getTaskListName()
  {
    return taskListName;
  }

  /**
   * Sets the field taskListName.
   * @param _taskListName the new value of the field taskListName.
   */
  public void setTaskListName(java.lang.String _taskListName)
  {
    taskListName = _taskListName;
  }

  private java.lang.Boolean isBackFromDrilldown;

  /**
   * Gets the field isBackFromDrilldown.
   * @return the value of the field isBackFromDrilldown; may be null.
   */
  public java.lang.Boolean getIsBackFromDrilldown()
  {
    return isBackFromDrilldown;
  }

  /**
   * Sets the field isBackFromDrilldown.
   * @param _isBackFromDrilldown the new value of the field isBackFromDrilldown.
   */
  public void setIsBackFromDrilldown(java.lang.Boolean _isBackFromDrilldown)
  {
    isBackFromDrilldown = _isBackFromDrilldown;
  }

}
