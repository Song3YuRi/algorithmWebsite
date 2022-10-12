function Login(){
    return(
        <div className="login_wrap">
            <div className="login_header">
                <h3>algorithm</h3>
                <h3>로그인</h3>
            </div>
            <div className="login_body">
                <form>
                    <ul>
                        <li>
                            <input type="text" name="login_id" placeholder="아이디" className="input_id"/>
                        </li>
                        <li>
                            <input type="password" name="login_pwd" placeholder="비밀번호" className="input_id"/>
                        </li>                        
                    </ul>
                    <button>
                        로그인
                    </button>
                </form>
            </div>
            <div className="login_footer">
                <ul>
                    <li><a>아이디 찾기</a></li>
                    <li><a>비밀번호 찾기</a></li>
                    <li><a>회원가입</a></li>                                        
                </ul>
            </div>
        </div>
    );
}

export default Login;