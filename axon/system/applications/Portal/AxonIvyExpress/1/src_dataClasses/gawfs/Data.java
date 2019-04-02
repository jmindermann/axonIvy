package gawfs;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class Data", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class Data extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -8604498714617283773L;

  /**
   * Process Steps for ProcessChain
   */
  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> steps;

  /**
   * Gets the field steps.
   * @return the value of the field steps; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getSteps()
  {
    return steps;
  }

  /**
   * Sets the field steps.
   * @param _steps the new value of the field steps.
   */
  public void setSteps(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _steps)
  {
    steps = _steps;
  }

  /**
   * List of Tasks for execution
   */
  private transient ch.ivyteam.ivy.scripting.objects.List<gawfs.TaskDef> definedTasks;

  /**
   * Gets the field definedTasks.
   * @return the value of the field definedTasks; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<gawfs.TaskDef> getDefinedTasks()
  {
    return definedTasks;
  }

  /**
   * Sets the field definedTasks.
   * @param _definedTasks the new value of the field definedTasks.
   */
  public void setDefinedTasks(ch.ivyteam.ivy.scripting.objects.List<gawfs.TaskDef> _definedTasks)
  {
    definedTasks = _definedTasks;
  }

  /**
   * Name of the Process also later CaseName
   */
  private transient java.lang.String processName;

  /**
   * Gets the field processName.
   * @return the value of the field processName; may be null.
   */
  public java.lang.String getProcessName()
  {
    return processName;
  }

  /**
   * Sets the field processName.
   * @param _processName the new value of the field processName.
   */
  public void setProcessName(java.lang.String _processName)
  {
    processName = _processName;
  }

  /**
   * Description of the Process later CaseDescription
   */
  private transient java.lang.String processDescription;

  /**
   * Gets the field processDescription.
   * @return the value of the field processDescription; may be null.
   */
  public java.lang.String getProcessDescription()
  {
    return processDescription;
  }

  /**
   * Sets the field processDescription.
   * @param _processDescription the new value of the field processDescription.
   */
  public void setProcessDescription(java.lang.String _processDescription)
  {
    processDescription = _processDescription;
  }

  /**
   * Processtype
   */
  private transient java.lang.String processType;

  /**
   * Gets the field processType.
   * @return the value of the field processType; may be null.
   */
  public java.lang.String getProcessType()
  {
    return processType;
  }

  /**
   * Sets the field processType.
   * @param _processType the new value of the field processType.
   */
  public void setProcessType(java.lang.String _processType)
  {
    processType = _processType;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> wfusers;

  /**
   * Gets the field wfusers.
   * @return the value of the field wfusers; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> getWfusers()
  {
    return wfusers;
  }

  /**
   * Sets the field wfusers.
   * @param _wfusers the new value of the field wfusers.
   */
  public void setWfusers(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> _wfusers)
  {
    wfusers = _wfusers;
  }

  private transient ch.ivy.addon.portalkit.bo.ExpressProcess processRepository;

  /**
   * Gets the field processRepository.
   * @return the value of the field processRepository; may be null.
   */
  public ch.ivy.addon.portalkit.bo.ExpressProcess getProcessRepository()
  {
    return processRepository;
  }

  /**
   * Sets the field processRepository.
   * @param _processRepository the new value of the field processRepository.
   */
  public void setProcessRepository(ch.ivy.addon.portalkit.bo.ExpressProcess _processRepository)
  {
    processRepository = _processRepository;
  }

  private transient ch.ivy.addon.portalkit.bo.ExpressTaskDefinition taskRepository;

  /**
   * Gets the field taskRepository.
   * @return the value of the field taskRepository; may be null.
   */
  public ch.ivy.addon.portalkit.bo.ExpressTaskDefinition getTaskRepository()
  {
    return taskRepository;
  }

  /**
   * Sets the field taskRepository.
   * @param _taskRepository the new value of the field taskRepository.
   */
  public void setTaskRepository(ch.ivy.addon.portalkit.bo.ExpressTaskDefinition _taskRepository)
  {
    taskRepository = _taskRepository;
  }

  private transient ch.ivy.addon.portalkit.bo.ExpressFormElement formelementRepository;

  /**
   * Gets the field formelementRepository.
   * @return the value of the field formelementRepository; may be null.
   */
  public ch.ivy.addon.portalkit.bo.ExpressFormElement getFormelementRepository()
  {
    return formelementRepository;
  }

  /**
   * Sets the field formelementRepository.
   * @param _formelementRepository the new value of the field formelementRepository.
   */
  public void setFormelementRepository(ch.ivy.addon.portalkit.bo.ExpressFormElement _formelementRepository)
  {
    formelementRepository = _formelementRepository;
  }

  private transient ch.ivy.gawfs.DragAndDropController dragAndDropController;

  /**
   * Gets the field dragAndDropController.
   * @return the value of the field dragAndDropController; may be null.
   */
  public ch.ivy.gawfs.DragAndDropController getDragAndDropController()
  {
    return dragAndDropController;
  }

  /**
   * Sets the field dragAndDropController.
   * @param _dragAndDropController the new value of the field dragAndDropController.
   */
  public void setDragAndDropController(ch.ivy.gawfs.DragAndDropController _dragAndDropController)
  {
    dragAndDropController = _dragAndDropController;
  }

  private transient ch.ivy.gawfs.DynaFormController dynaFormController;

  /**
   * Gets the field dynaFormController.
   * @return the value of the field dynaFormController; may be null.
   */
  public ch.ivy.gawfs.DynaFormController getDynaFormController()
  {
    return dynaFormController;
  }

  /**
   * Sets the field dynaFormController.
   * @param _dynaFormController the new value of the field dynaFormController.
   */
  public void setDynaFormController(ch.ivy.gawfs.DynaFormController _dynaFormController)
  {
    dynaFormController = _dynaFormController;
  }

  private transient java.lang.Boolean backFlag;

  /**
   * Gets the field backFlag.
   * @return the value of the field backFlag; may be null.
   */
  public java.lang.Boolean getBackFlag()
  {
    return backFlag;
  }

  /**
   * Sets the field backFlag.
   * @param _backFlag the new value of the field backFlag.
   */
  public void setBackFlag(java.lang.Boolean _backFlag)
  {
    backFlag = _backFlag;
  }

  private transient java.lang.String processID;

  /**
   * Gets the field processID.
   * @return the value of the field processID; may be null.
   */
  public java.lang.String getProcessID()
  {
    return processID;
  }

  /**
   * Sets the field processID.
   * @param _processID the new value of the field processID.
   */
  public void setProcessID(java.lang.String _processID)
  {
    processID = _processID;
  }

  private transient java.lang.Boolean directExecutionFlag;

  /**
   * Gets the field directExecutionFlag.
   * @return the value of the field directExecutionFlag; may be null.
   */
  public java.lang.Boolean getDirectExecutionFlag()
  {
    return directExecutionFlag;
  }

  /**
   * Sets the field directExecutionFlag.
   * @param _directExecutionFlag the new value of the field directExecutionFlag.
   */
  public void setDirectExecutionFlag(java.lang.Boolean _directExecutionFlag)
  {
    directExecutionFlag = _directExecutionFlag;
  }

  /**
   * Taskid for Endpage
   */
  private transient java.lang.Number taskId;

  /**
   * Gets the field taskId.
   * @return the value of the field taskId; may be null.
   */
  public java.lang.Number getTaskId()
  {
    return taskId;
  }

  /**
   * Sets the field taskId.
   * @param _taskId the new value of the field taskId.
   */
  public void setTaskId(java.lang.Number _taskId)
  {
    taskId = _taskId;
  }

  private transient java.lang.Boolean discard;

  /**
   * Gets the field discard.
   * @return the value of the field discard; may be null.
   */
  public java.lang.Boolean getDiscard()
  {
    return discard;
  }

  /**
   * Sets the field discard.
   * @param _discard the new value of the field discard.
   */
  public void setDiscard(java.lang.Boolean _discard)
  {
    discard = _discard;
  }

}
