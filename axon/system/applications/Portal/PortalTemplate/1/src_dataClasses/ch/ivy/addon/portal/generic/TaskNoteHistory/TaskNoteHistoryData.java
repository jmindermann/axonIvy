package ch.ivy.addon.portal.generic.TaskNoteHistory;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class TaskNoteHistoryData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskNoteHistoryData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -203087115633682531L;

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyNote> notes;

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

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyNote> filteredNotes;

  /**
   * Gets the field filteredNotes.
   * @return the value of the field filteredNotes; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyNote> getFilteredNotes()
  {
    return filteredNotes;
  }

  /**
   * Sets the field filteredNotes.
   * @param _filteredNotes the new value of the field filteredNotes.
   */
  public void setFilteredNotes(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyNote> _filteredNotes)
  {
    filteredNotes = _filteredNotes;
  }

}
