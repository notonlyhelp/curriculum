
public class Main{
    public static void main(String[] args){
        /*
        * ��1
        * int�^�̔z��data���쐬���A�l��3,1,2,7,5�ŏ��������Ȃ���
        */
    
    	//��1�@��
        //�z��data��3.1.2.7.5�̏��ԂŊi�[
    	int data[] = {3, 1, 2, 7, 5};

        
//         ��2
//         �ȉ���for�������������Ȃ���
//        for(int i = 0; i < /*�����ɋL�q*/; i++){
//        	System.out.print(data[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < /*�����ɋL�q*/; i++) {
//        	for (int j = /*�����ɋL�q*/; j > i; j--) {
//        		/*
//        		 * ��3
//        		 * �ȉ��A�z��̓Y�������ă\�[�g�����������Ȃ���
//        		 */
//        		if(data[/*�����ɋL�q*/] > data[/*�����ɋL�q*/]){
//        			int box = data[/*�����ɋL�q*/];
//        			data[/*�����ɋL�q*/] = data[/*�����ɋL�q*/];
//        			data[/*�����ɋL�q*/] = box;
//        		}
//        	}
//        }
//        for(int i = 0; i < data.length; i++){
//        	System.out.print(data[i] + " ");
//        }
//    }
    		
        //��2�@��	�v�����g����:31275
        for(int i = 0; i < data.length; i++){
        	System.out.print(data[i] + "");
        }
        System.out.println();
        
        for (int i = 0; i < data.length; i++) {
            for (int j =data.length - 1; j > i; j--) {
                /*
                * ��3
                * �ȉ��A�z��̓Y�������ă\�[�g�����������Ȃ���
                */
                if(data[j-1] > data[j]){
                  int box = data[j];
                  data[j] = data[j-1];
                  data[j-1] = box;
                }
            }
        }
        
        //��2�@��	�v�����g����:12357
        for(int i = 0; i < data.length; i++){
        	System.out.print(data[i] + "");
        }
    }
}