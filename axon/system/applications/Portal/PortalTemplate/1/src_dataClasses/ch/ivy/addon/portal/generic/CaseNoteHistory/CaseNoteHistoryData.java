package ch.ivy.addon.portal.generic.CaseNoteHistory;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class CaseNoteHistoryData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CaseNoteHistoryData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -5936087742577160005L;

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.History> histories;

  /**
   * Gets the field histories.
   * @return the value of the field histories; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.History> getHistories()
  {
    return histories;
  }

  /**
   * Sets the field histories.
   * @param _histories the new value of the field histories.
   */
  public void setHistories(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.History> _histories)
  {
    histories = _histories;
  }

  private java.lang.String exportedFileName;

  /**
   * Gets the field exportedFileName.
   * @return the value of the field exportedFileName; may be null.
   */
  public java.lang.String getExportedFileName()
  {
    return exportedFileName;
  }

  /**
   * Sets the field exportedFileName.
   * @param _exportedFileName the new value of the field exportedFileName.
   */
  public void setExportedFileName(java.lang.String _exportedFileName)
  {
    exportedFileName = _exportedFileName;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.History> filteredHistories;

  /**
   * Gets the field filteredHistories.
   * @return the value of the field filteredHistories; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.History> getFilteredHistories()
  {
    return filteredHistories;
  }

  /**
   * Sets the field filteredHistories.
   * @param _filteredHistories the new value of the field filteredHistories.
   */
  public void setFilteredHistories(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.History> _filteredHistories)
  {
    filteredHistories = _filteredHistories;
  }

}
