package ch.ivy.addon.portalkit.component.StatisticWidget;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class StatisticWidgetData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class StatisticWidgetData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3420847250679807447L;

  private java.lang.Boolean compactMode;

  /**
   * Gets the field compactMode.
   * @return the value of the field compactMode; may be null.
   */
  public java.lang.Boolean getCompactMode()
  {
    return compactMode;
  }

  /**
   * Sets the field compactMode.
   * @param _compactMode the new value of the field compactMode.
   */
  public void setCompactMode(java.lang.Boolean _compactMode)
  {
    compactMode = _compactMode;
  }

  private java.lang.String username;

  /**
   * Gets the field username.
   * @return the value of the field username; may be null.
   */
  public java.lang.String getUsername()
  {
    return username;
  }

  /**
   * Sets the field username.
   * @param _username the new value of the field username.
   */
  public void setUsername(java.lang.String _username)
  {
    username = _username;
  }

  /**
   * the id of the selected server
   */
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

  /**
   * the name of the selected app
   */
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

  private java.lang.Boolean createMode;

  /**
   * Gets the field createMode.
   * @return the value of the field createMode; may be null.
   */
  public java.lang.Boolean getCreateMode()
  {
    return createMode;
  }

  /**
   * Sets the field createMode.
   * @param _createMode the new value of the field createMode.
   */
  public void setCreateMode(java.lang.Boolean _createMode)
  {
    createMode = _createMode;
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

  private java.lang.Boolean isDrilldownElapsedTime;

  /**
   * Gets the field isDrilldownElapsedTime.
   * @return the value of the field isDrilldownElapsedTime; may be null.
   */
  public java.lang.Boolean getIsDrilldownElapsedTime()
  {
    return isDrilldownElapsedTime;
  }

  /**
   * Sets the field isDrilldownElapsedTime.
   * @param _isDrilldownElapsedTime the new value of the field isDrilldownElapsedTime.
   */
  public void setIsDrilldownElapsedTime(java.lang.Boolean _isDrilldownElapsedTime)
  {
    isDrilldownElapsedTime = _isDrilldownElapsedTime;
  }

  private java.lang.Boolean isDrilldownExpiryChart;

  /**
   * Gets the field isDrilldownExpiryChart.
   * @return the value of the field isDrilldownExpiryChart; may be null.
   */
  public java.lang.Boolean getIsDrilldownExpiryChart()
  {
    return isDrilldownExpiryChart;
  }

  /**
   * Sets the field isDrilldownExpiryChart.
   * @param _isDrilldownExpiryChart the new value of the field isDrilldownExpiryChart.
   */
  public void setIsDrilldownExpiryChart(java.lang.Boolean _isDrilldownExpiryChart)
  {
    isDrilldownExpiryChart = _isDrilldownExpiryChart;
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
