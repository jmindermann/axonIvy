package ch.ivy.addon.portalkit.component.TaskItemDocuments;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class TaskItemDocumentsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskItemDocumentsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8873047162308086586L;

  private ch.ivy.ws.addon.IvyDocument document;

  /**
   * Gets the field document.
   * @return the value of the field document; may be null.
   */
  public ch.ivy.ws.addon.IvyDocument getDocument()
  {
    return document;
  }

  /**
   * Sets the field document.
   * @param _document the new value of the field document.
   */
  public void setDocument(ch.ivy.ws.addon.IvyDocument _document)
  {
    document = _document;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyDocument> documents;

  /**
   * Gets the field documents.
   * @return the value of the field documents; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyDocument> getDocuments()
  {
    return documents;
  }

  /**
   * Sets the field documents.
   * @param _documents the new value of the field documents.
   */
  public void setDocuments(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyDocument> _documents)
  {
    documents = _documents;
  }

  private java.lang.Long documentId;

  /**
   * Gets the field documentId.
   * @return the value of the field documentId; may be null.
   */
  public java.lang.Long getDocumentId()
  {
    return documentId;
  }

  /**
   * Sets the field documentId.
   * @param _documentId the new value of the field documentId.
   */
  public void setDocumentId(java.lang.Long _documentId)
  {
    documentId = _documentId;
  }

  private org.primefaces.model.StreamedContent documentFile;

  /**
   * Gets the field documentFile.
   * @return the value of the field documentFile; may be null.
   */
  public org.primefaces.model.StreamedContent getDocumentFile()
  {
    return documentFile;
  }

  /**
   * Sets the field documentFile.
   * @param _documentFile the new value of the field documentFile.
   */
  public void setDocumentFile(org.primefaces.model.StreamedContent _documentFile)
  {
    documentFile = _documentFile;
  }

  private javax.activation.DataHandler documentContent;

  /**
   * Gets the field documentContent.
   * @return the value of the field documentContent; may be null.
   */
  public javax.activation.DataHandler getDocumentContent()
  {
    return documentContent;
  }

  /**
   * Sets the field documentContent.
   * @param _documentContent the new value of the field documentContent.
   */
  public void setDocumentContent(javax.activation.DataHandler _documentContent)
  {
    documentContent = _documentContent;
  }

  private org.primefaces.event.FileUploadEvent documentUploadEvent;

  /**
   * Gets the field documentUploadEvent.
   * @return the value of the field documentUploadEvent; may be null.
   */
  public org.primefaces.event.FileUploadEvent getDocumentUploadEvent()
  {
    return documentUploadEvent;
  }

  /**
   * Sets the field documentUploadEvent.
   * @param _documentUploadEvent the new value of the field documentUploadEvent.
   */
  public void setDocumentUploadEvent(org.primefaces.event.FileUploadEvent _documentUploadEvent)
  {
    documentUploadEvent = _documentUploadEvent;
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

  private ch.ivy.addon.portalkit.enums.UploadDocumentCheckStatus uploadDocumentCheckStatus;

  /**
   * Gets the field uploadDocumentCheckStatus.
   * @return the value of the field uploadDocumentCheckStatus; may be null.
   */
  public ch.ivy.addon.portalkit.enums.UploadDocumentCheckStatus getUploadDocumentCheckStatus()
  {
    return uploadDocumentCheckStatus;
  }

  /**
   * Sets the field uploadDocumentCheckStatus.
   * @param _uploadDocumentCheckStatus the new value of the field uploadDocumentCheckStatus.
   */
  public void setUploadDocumentCheckStatus(ch.ivy.addon.portalkit.enums.UploadDocumentCheckStatus _uploadDocumentCheckStatus)
  {
    uploadDocumentCheckStatus = _uploadDocumentCheckStatus;
  }

  private java.lang.String uploadDocumentCheckMessage;

  /**
   * Gets the field uploadDocumentCheckMessage.
   * @return the value of the field uploadDocumentCheckMessage; may be null.
   */
  public java.lang.String getUploadDocumentCheckMessage()
  {
    return uploadDocumentCheckMessage;
  }

  /**
   * Sets the field uploadDocumentCheckMessage.
   * @param _uploadDocumentCheckMessage the new value of the field uploadDocumentCheckMessage.
   */
  public void setUploadDocumentCheckMessage(java.lang.String _uploadDocumentCheckMessage)
  {
    uploadDocumentCheckMessage = _uploadDocumentCheckMessage;
  }

  private java.lang.Boolean isShowUploadDocumentButton;

  /**
   * Gets the field isShowUploadDocumentButton.
   * @return the value of the field isShowUploadDocumentButton; may be null.
   */
  public java.lang.Boolean getIsShowUploadDocumentButton()
  {
    return isShowUploadDocumentButton;
  }

  /**
   * Sets the field isShowUploadDocumentButton.
   * @param _isShowUploadDocumentButton the new value of the field isShowUploadDocumentButton.
   */
  public void setIsShowUploadDocumentButton(java.lang.Boolean _isShowUploadDocumentButton)
  {
    isShowUploadDocumentButton = _isShowUploadDocumentButton;
  }

}
