package ch.ivy.add.portalkit;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class UploadDocumentCheckerData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class UploadDocumentCheckerData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8138560227460966033L;

  private transient org.primefaces.model.UploadedFile uploadedFile;

  /**
   * Gets the field uploadedFile.
   * @return the value of the field uploadedFile; may be null.
   */
  public org.primefaces.model.UploadedFile getUploadedFile()
  {
    return uploadedFile;
  }

  /**
   * Sets the field uploadedFile.
   * @param _uploadedFile the new value of the field uploadedFile.
   */
  public void setUploadedFile(org.primefaces.model.UploadedFile _uploadedFile)
  {
    uploadedFile = _uploadedFile;
  }

  private transient ch.ivy.addon.portalkit.enums.UploadDocumentCheckStatus checkStatus;

  /**
   * Gets the field checkStatus.
   * @return the value of the field checkStatus; may be null.
   */
  public ch.ivy.addon.portalkit.enums.UploadDocumentCheckStatus getCheckStatus()
  {
    return checkStatus;
  }

  /**
   * Sets the field checkStatus.
   * @param _checkStatus the new value of the field checkStatus.
   */
  public void setCheckStatus(ch.ivy.addon.portalkit.enums.UploadDocumentCheckStatus _checkStatus)
  {
    checkStatus = _checkStatus;
  }

  private transient java.lang.String message;

  /**
   * Gets the field message.
   * @return the value of the field message; may be null.
   */
  public java.lang.String getMessage()
  {
    return message;
  }

  /**
   * Sets the field message.
   * @param _message the new value of the field message.
   */
  public void setMessage(java.lang.String _message)
  {
    message = _message;
  }

}
