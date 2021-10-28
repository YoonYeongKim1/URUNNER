import {
    FETCH_MEMBER,
    FETCH_MY_INTRODUCE,

    // 공지 사항
    FETCH_NOTICE_LIST,
    FETCH_NOTICE,

} from './mutation-types'

import axios from 'axios'

export default {
    fetchMember ({ commit }, memberNo) {
        return axios.get(`http://localhost:7777/memberManagement/${memberNo}`)
                .then((res) => {
                    commit(FETCH_MEMBER, res.data)
                })
    },
    fetchMyIntroduce ({ commit }, userId) {
        return axios.get(`http://localhost:7777/profile/introduce/${userId}`)
                .then((res) => {
                    commit(FETCH_MY_INTRODUCE, res.data)
                    console.log('res데이타는')
                    console.log(res.data)
                    this.$store.state.introduce = res.data
                })
    },
    fetchNoticeList ({ commit }) {
        return axios.get('http://localhost:7777/notice/noticeLists')
                .then((res) => {
                    commit(FETCH_NOTICE_LIST, res.data)
                })
    },
    fetchNotice ({ commit }, noticeNo) {
        return axios.get(`http://localhost:7777/notice/${noticeNo}`)
                .then((res) => {
                    commit(FETCH_NOTICE, res.data)
                })
    }
}
