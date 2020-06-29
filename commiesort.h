#ifndef COMMIESORT_COMMIESORT_H
#define COMMIESORT_COMMIESORT_H
#endif

#include <vector>

namespace commiesort {
    template<class T>
    std::vector<T> sort(std::vector<T> vec) {
        unsigned int length = vec.size();
        for (unsigned int idx = 0; idx < length - 1; idx++) {
            if (vec[idx] >= vec[idx + 1]) {
                vec.erase(vec.begin() + idx + 1);
                return sort(vec);
            }
        }
        return vec;
    }
}
