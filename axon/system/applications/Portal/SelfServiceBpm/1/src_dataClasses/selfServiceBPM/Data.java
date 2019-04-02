package selfServiceBPM;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class Data", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class Data extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 491565919280398856L;

  private ch.ivyteam.ivy.scripting.objects.List<selfServiceBPM.TaskDef> definedTasks;

  /**
   * Gets the field definedTasks.
   * @return the value of the field definedTasks; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<selfServiceBPM.TaskDef> getDefinedTasks()
  {
    return definedTasks;
  }

  /**
   * Sets the field definedTasks.
   * @param _definedTasks the new value of the field definedTasks.
   */
  public void setDefinedTasks(ch.ivyteam.ivy.scripting.objects.List<selfServiceBPM.TaskDef> _definedTasks)
  {
    definedTasks = _definedTasks;
  }

  private selfServiceBPM.CaseDef caseInfo;

  /**
   * Gets the field caseInfo.
   * @return the value of the field caseInfo; may be null.
   */
  public selfServiceBPM.CaseDef getCaseInfo()
  {
    return caseInfo;
  }

  /**
   * Sets the field caseInfo.
   * @param _caseInfo the new value of the field caseInfo.
   */
  public void setCaseInfo(selfServiceBPM.CaseDef _caseInfo)
  {
    caseInfo = _caseInfo;
  }

  private selfServiceBPM.TaskDef nextTask;

  /**
   * Gets the field nextTask.
   * @return the value of the field nextTask; may be null.
   */
  public selfServiceBPM.TaskDef getNextTask()
  {
    return nextTask;
  }

  /**
   * Sets the field nextTask.
   * @param _nextTask the new value of the field nextTask.
   */
  public void setNextTask(selfServiceBPM.TaskDef _nextTask)
  {
    nextTask = _nextTask;
  }

  private transient java.lang.String answer;

  /**
   * Gets the field answer.
   * @return the value of the field answer; may be null.
   */
  public java.lang.String getAnswer()
  {
    return answer;
  }

  /**
   * Sets the field answer.
   * @param _answer the new value of the field answer.
   */
  public void setAnswer(java.lang.String _answer)
  {
    answer = _answer;
  }

  private java.lang.Long originalTaskId;

  /**
   * Gets the field originalTaskId.
   * @return the value of the field originalTaskId; may be null.
   */
  public java.lang.Long getOriginalTaskId()
  {
    return originalTaskId;
  }

  /**
   * Sets the field originalTaskId.
   * @param _originalTaskId the new value of the field originalTaskId.
   */
  public void setOriginalTaskId(java.lang.Long _originalTaskId)
  {
    originalTaskId = _originalTaskId;
  }

  private java.lang.Boolean isAddingAdhocToOtherTask;

  /**
   * Gets the field isAddingAdhocToOtherTask.
   * @return the value of the field isAddingAdhocToOtherTask; may be null.
   */
  public java.lang.Boolean getIsAddingAdhocToOtherTask()
  {
    return isAddingAdhocToOtherTask;
  }

  /**
   * Sets the field isAddingAdhocToOtherTask.
   * @param _isAddingAdhocToOtherTask the new value of the field isAddingAdhocToOtherTask.
   */
  public void setIsAddingAdhocToOtherTask(java.lang.Boolean _isAddingAdhocToOtherTask)
  {
    isAddingAdhocToOtherTask = _isAddingAdhocToOtherTask;
  }

}
