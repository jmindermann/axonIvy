package ch.ivy.addon.portalkit.component.statistic.ChartCreationWidget;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ChartCreationWidgetData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ChartCreationWidgetData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 5694700949113181062L;

  private ch.ivy.addon.portalkit.statistics.StatisticFilter statisticFilter;

  /**
   * Gets the field statisticFilter.
   * @return the value of the field statisticFilter; may be null.
   */
  public ch.ivy.addon.portalkit.statistics.StatisticFilter getStatisticFilter()
  {
    return statisticFilter;
  }

  /**
   * Sets the field statisticFilter.
   * @param _statisticFilter the new value of the field statisticFilter.
   */
  public void setStatisticFilter(ch.ivy.addon.portalkit.statistics.StatisticFilter _statisticFilter)
  {
    statisticFilter = _statisticFilter;
  }

  private java.lang.String chartName;

  /**
   * Gets the field chartName.
   * @return the value of the field chartName; may be null.
   */
  public java.lang.String getChartName()
  {
    return chartName;
  }

  /**
   * Sets the field chartName.
   * @param _chartName the new value of the field chartName.
   */
  public void setChartName(java.lang.String _chartName)
  {
    chartName = _chartName;
  }

  private ch.ivy.addon.portalkit.enums.StatisticChartType chartType;

  /**
   * Gets the field chartType.
   * @return the value of the field chartType; may be null.
   */
  public ch.ivy.addon.portalkit.enums.StatisticChartType getChartType()
  {
    return chartType;
  }

  /**
   * Sets the field chartType.
   * @param _chartType the new value of the field chartType.
   */
  public void setChartType(ch.ivy.addon.portalkit.enums.StatisticChartType _chartType)
  {
    chartType = _chartType;
  }

  private java.lang.Boolean isChartNameExisted;

  /**
   * Gets the field isChartNameExisted.
   * @return the value of the field isChartNameExisted; may be null.
   */
  public java.lang.Boolean getIsChartNameExisted()
  {
    return isChartNameExisted;
  }

  /**
   * Sets the field isChartNameExisted.
   * @param _isChartNameExisted the new value of the field isChartNameExisted.
   */
  public void setIsChartNameExisted(java.lang.Boolean _isChartNameExisted)
  {
    isChartNameExisted = _isChartNameExisted;
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

}
