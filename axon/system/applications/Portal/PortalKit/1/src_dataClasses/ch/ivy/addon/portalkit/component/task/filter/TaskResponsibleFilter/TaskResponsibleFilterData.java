package ch.ivy.addon.portalkit.component.task.filter.TaskResponsibleFilter;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class TaskResponsibleFilterData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskResponsibleFilterData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -7188791859260613561L;

  private java.lang.String queryAutoComplete;

  /**
   * Gets the field queryAutoComplete.
   * @return the value of the field queryAutoComplete; may be null.
   */
  public java.lang.String getQueryAutoComplete()
  {
    return queryAutoComplete;
  }

  /**
   * Sets the field queryAutoComplete.
   * @param _queryAutoComplete the new value of the field queryAutoComplete.
   */
  public void setQueryAutoComplete(java.lang.String _queryAutoComplete)
  {
    queryAutoComplete = _queryAutoComplete;
  }

  private java.util.List<ch.ivy.addon.portalkit.bo.RemoteSecurityMember> responsibles;

  /**
   * Gets the field responsibles.
   * @return the value of the field responsibles; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.bo.RemoteSecurityMember> getResponsibles()
  {
    return responsibles;
  }

  /**
   * Sets the field responsibles.
   * @param _responsibles the new value of the field responsibles.
   */
  public void setResponsibles(java.util.List<ch.ivy.addon.portalkit.bo.RemoteSecurityMember> _responsibles)
  {
    responsibles = _responsibles;
  }

}
