import '../Style/login.css';

function SignUp(){
    return(
        <div className="signup_wrap">
            <div className="signup_header">
                <h2>algorithm</h2>
                <h3>회원가입</h3>
            </div>
            <div className="signup_body">
                <form>
                    <ul>
                        <li>
                            <h3 className='input_title'>아이디</h3>
                            <input type="text" name="signup_id" className="input_id"/>
                        </li>
                        <li>
                            <h3 className='input_title'>비밀번호</h3>
                            <input type="password" name="signup_pwd" className="input_id"/>
                        </li>
                        <li>
                            <h3 className='input_title'>비밀번호 확인</h3>
                            <input type="password" name="signup_pwd_confirm" className="input_id"/>
                        </li>
                        <li>
                            <h3 className='input_title'>이메일</h3>
                            <input type="password" name="signup_email"  className="input_id"/>
                        </li>                                                
                    </ul>
                    <button>
                        가입하기
                    </button>
                </form>               
            </div>
        </div>
    );
}

export default SignUp;