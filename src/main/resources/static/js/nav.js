var homePage = new Vue({
    el :'#homeNav',
    data:{
        type:getCookie('type'),
        admin_type:true,
        admin_name:'教师信息',
        start: '',
        end: '',
        CurrentSemester: ''
    },
    methods:{
        demo1:function(){
            if(this.type == 2){
                this.admin_type = false;
            }
            // if(this.type == 1){
            //     this.admin_type = false;
            // }
        },
        demo2:function(){
            console.log(getCookie('type'));
        }
    },
    mounted:function(){
        this.demo1();
    }

})