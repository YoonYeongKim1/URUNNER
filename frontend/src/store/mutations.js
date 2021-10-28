import {
    FETCH_MEMBER,
    FETCH_MY_INTRODUCE,
    // 공지 사항
    FETCH_NOTICE_LIST,
    FETCH_NOTICE,

} from './mutation-types'

export default {
    [FETCH_MEMBER] (state, member) {
        state.member = member
    },
    [FETCH_MY_INTRODUCE] (state, introduce) {
        state.introduce = introduce
    },
    [FETCH_NOTICE_LIST] (state, notices) {
        state.notices = notices;
    },
    [FETCH_NOTICE] (state, notice) {
        state.notice = notice
    }
}