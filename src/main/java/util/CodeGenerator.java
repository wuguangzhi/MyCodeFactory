package util;


import cn.org.rapid_framework.generator.GeneratorFacade;

public class CodeGenerator {

	public static void main(String[] args) throws Exception {
        //ģ��·��
		String templatePath = "D:/workspace/MyCodeFactory/src/main/resources/template";
		
		GeneratorFacade g = new GeneratorFacade();
		g.getGenerator().addTemplateRootDir(templatePath);
		
		// ɾ�������������Ŀ¼//
		// g.deleteOutRootDir();
		
		// ͨ�����ݿ�������ļ�
		g.generateByTable("task_log");

		// �Զ��������ݿ��е����б������ļ�,templateΪģ��ĸ�Ŀ¼
		// g.generateByAllTable();
		
		// ��table����ɾ���ļ�
		// g.deleteByTable("table_name", "template");
	}

}
