package ch.ivy.addon.portalkit.multiapp.settings.PasswordSetting;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class PasswordSettingData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PasswordSettingData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2532757136340370477L;

  private java.lang.String currentPassword;

  /**
   * Gets the field currentPassword.
   * @return the value of the field currentPassword; may be null.
   */
  public java.lang.String getCurrentPassword()
  {
    return currentPassword;
  }

  /**
   * Sets the field currentPassword.
   * @param _currentPassword the new value of the field currentPassword.
   */
  public void setCurrentPassword(java.lang.String _currentPassword)
  {
    currentPassword = _currentPassword;
  }

  private java.lang.String newPassword;

  /**
   * Gets the field newPassword.
   * @return the value of the field newPassword; may be null.
   */
  public java.lang.String getNewPassword()
  {
    return newPassword;
  }

  /**
   * Sets the field newPassword.
   * @param _newPassword the new value of the field newPassword.
   */
  public void setNewPassword(java.lang.String _newPassword)
  {
    newPassword = _newPassword;
  }

  private java.lang.String confirmPassword;

  /**
   * Gets the field confirmPassword.
   * @return the value of the field confirmPassword; may be null.
   */
  public java.lang.String getConfirmPassword()
  {
    return confirmPassword;
  }

  /**
   * Sets the field confirmPassword.
   * @param _confirmPassword the new value of the field confirmPassword.
   */
  public void setConfirmPassword(java.lang.String _confirmPassword)
  {
    confirmPassword = _confirmPassword;
  }

  private java.lang.Boolean isCurrentPasswordCorrect;

  /**
   * Gets the field isCurrentPasswordCorrect.
   * @return the value of the field isCurrentPasswordCorrect; may be null.
   */
  public java.lang.Boolean getIsCurrentPasswordCorrect()
  {
    return isCurrentPasswordCorrect;
  }

  /**
   * Sets the field isCurrentPasswordCorrect.
   * @param _isCurrentPasswordCorrect the new value of the field isCurrentPasswordCorrect.
   */
  public void setIsCurrentPasswordCorrect(java.lang.Boolean _isCurrentPasswordCorrect)
  {
    isCurrentPasswordCorrect = _isCurrentPasswordCorrect;
  }

  private ch.ivy.addon.portalkit.enums.ChangePasswordStatus status;

  /**
   * Gets the field status.
   * @return the value of the field status; may be null.
   */
  public ch.ivy.addon.portalkit.enums.ChangePasswordStatus getStatus()
  {
    return status;
  }

  /**
   * Sets the field status.
   * @param _status the new value of the field status.
   */
  public void setStatus(ch.ivy.addon.portalkit.enums.ChangePasswordStatus _status)
  {
    status = _status;
  }

  private java.lang.String message;

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
