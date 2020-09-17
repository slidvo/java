package access_modifiers;

/*
 * Class marked as a public accessible in all java world (code of a project)
 */
public class PublicClassMod extends ProtectedClassMemberMod{
	public void runDefaultClassMod() {
		DefaultClassMod dcm = new DefaultClassMod();
		dcm.dcmGreetings();
	}

	public void runPublicClassMemberMethod() {
		PublicClassMemberMod pcmm = new PublicClassMemberMod();
		pcmm.publicClassMemberMethod();
	}

	public void runDefaultClassMemberMethod() {
		DefaultClassMemberMod dcmm = new DefaultClassMemberMod();
		dcmm.defaultClassMemberMethod();
	}
	public void runProtectedClassMemberMethod() {
		protectedClassMemberMethod();
	}
	public void runPrivateClassMemberMethods() {
		PrivateClassMemberMod pcmm = new PrivateClassMemberMod();
		//Syntax error : method not visible
		//pcmm.privateClassMemberMethod();
		pcmm.runPrivateMethods();
	}
}
